package ua.nure.makieiev.lab3.util;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

    private static final Logger logger = Logger.getLogger(FileReader.class);

    private static final String ENCODING = "UTF-8";
    private static final String PATH = "src/main/resources/";

    private FileReader() {
    }

    public static String readFile(String file) {
        String information = null;
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(PATH + file));
            information = new String(bytes, ENCODING);
        } catch (IOException ex) {
            logger.error(ex.getMessage());
        }
        return information;
    }


}
