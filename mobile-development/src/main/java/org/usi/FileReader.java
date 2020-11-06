package org.usi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader {

    private static final Logger log = LoggerFactory.getLogger(FileReader.class);

    public static void main(String[] args) {
        log.info("Start app");

        String fileName = "fileTest.txt";
        File file = new File(fileName);
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            log.error("File {} not found", fileName, e);
        }


        StringBuilder result = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                result.append(line).append("\n");
            }
            log.info(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
