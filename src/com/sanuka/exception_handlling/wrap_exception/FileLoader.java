package com.sanuka.exception_handlling.wrap_exception;

import com.sanuka.exception_handlling.exceptions.InsufficientDataNotLoadException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileLoader {

    public static void main(String[] args) {

        loadFile();
    }

    private static void loadFile() throws InsufficientDataNotLoadException {
        try {
            FileInputStream file;
            file = new FileInputStream("./filee.txt");
            System.out.println("file load successfully");
        } catch ( FileNotFoundException e) {
            throw new InsufficientDataNotLoadException("File not found ",e);
        }
    }
}
