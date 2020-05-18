package ua.nure.makieiev.lab3;

import ua.nure.makieiev.lab3.checker.CheckerStrategy;
import ua.nure.makieiev.lab3.checker.impl.BirthdayCheckerStrategy;
import ua.nure.makieiev.lab3.util.FIleWriter;
import ua.nure.makieiev.lab3.util.FileReader;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {
        CheckerStrategy checkerStrategy = new BirthdayCheckerStrategy();
        String correctFile = FileReader.readFile("trueContract.html");
        String fakeFile = FileReader.readFile("falseContract.html");
        String result = checkerStrategy.check(correctFile, fakeFile, 8);
        FIleWriter.writeStringToFile(result, "falseContract.html");
        System.out.println(result);
    }

}
