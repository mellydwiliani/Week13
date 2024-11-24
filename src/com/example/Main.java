package com.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final String FILE_PATH = System.getProperty("filePath", "example.txt");

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(FILE_PATH)) {
            int content;
            while ((content = fis.read()) != -1) {
                LOGGER.info(Character.toString((char) content));
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error membaca file di: " + FILE_PATH, e);
        }
    }
}
