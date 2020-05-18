package ua.nure.makieiev.lab3.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterHelper {

    private static final String PATH = "src/main/resources/";

    public static void writeStringToFile(String text, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(PATH + fileName));
        writer.write(text);
        writer.close();
    }

}
