package ua.nure.makieiev.lab3.checker;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.nure.makieiev.lab3.checker.impl.BirthdayCheckerStrategy;
import ua.nure.makieiev.lab3.checker.impl.HardCheckerStrategy;
import ua.nure.makieiev.lab3.util.FileReader;
import ua.nure.makieiev.lab3.util.FileWriterHelper;

import java.io.IOException;

public class CheckerStrategyTest {

    private String correctFile;
    private String fakeFile;

    @Before
    public void setUp() {
        correctFile = FileReader.readFile("trueContract.html");
        fakeFile = FileReader.readFile("falseContract.html");
    }

    @After
    public void tearDown() throws IOException {
        FileWriterHelper.writeStringToFile(fakeFile, "falseContract.html");
    }

    @Test
    public void shouldReturnFakeFileWhenUseHardMethodAndFourBits() throws IOException {
        CheckerStrategy checkerStrategy = new HardCheckerStrategy();
        String result = checkerStrategy.check(correctFile, fakeFile, 4);
        FileWriterHelper.writeStringToFile(result, "falseContract.html");
        Assert.assertTrue(fakeFile.length() != result.length());
    }

    @Test
    public void shouldReturnFakeFileWhenUseHardMethodAndEightBits() throws IOException {
        CheckerStrategy checkerStrategy = new HardCheckerStrategy();
        String result = checkerStrategy.check(correctFile, fakeFile, 8);
        FileWriterHelper.writeStringToFile(result, "falseContract.html");
        Assert.assertTrue(fakeFile.length() != result.length());
    }

    @Test
    public void shouldReturnFakeFileWhenUseHardMethodAndTwelveBits() throws IOException {
        CheckerStrategy checkerStrategy = new HardCheckerStrategy();
        String result = checkerStrategy.check(correctFile, fakeFile, 12);
        FileWriterHelper.writeStringToFile(result, "falseContract.html");
        Assert.assertTrue(fakeFile.length() != result.length());
    }

    @Test
    public void shouldReturnFakeFileWhenUseBirthdayMethodAndFourBits() throws IOException {
        CheckerStrategy checkerStrategy = new BirthdayCheckerStrategy();
        String result = checkerStrategy.check(correctFile, fakeFile, 4);
        FileWriterHelper.writeStringToFile(result, "falseContract.html");
        Assert.assertTrue(fakeFile.length() != result.length());
    }

    @Test
    public void shouldReturnFakeFileWhenUseBirthdayMethodAndEightBits() throws IOException {
        CheckerStrategy checkerStrategy = new BirthdayCheckerStrategy();
        String result = checkerStrategy.check(correctFile, fakeFile, 8);
        FileWriterHelper.writeStringToFile(result, "falseContract.html");
        Assert.assertTrue(fakeFile.length() != result.length());
    }

    @Test
    public void shouldReturnFakeFileWhenUseBirthdayMethodAndTwelveBits() throws IOException {
        CheckerStrategy checkerStrategy = new BirthdayCheckerStrategy();
        String result = checkerStrategy.check(correctFile, fakeFile, 12);
        FileWriterHelper.writeStringToFile(result, "falseContract.html");
        Assert.assertTrue(fakeFile.length() != result.length());
    }

}