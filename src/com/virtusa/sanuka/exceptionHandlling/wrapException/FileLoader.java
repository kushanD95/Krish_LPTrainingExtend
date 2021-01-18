package com.virtusa.sanuka.exceptionHandlling.wrapException;

import com.virtusa.sanuka.exceptionHandlling.exceptions.InsufficientDataNotLoadException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileLoader {

    public static void main(String[] args) {
        try {
            loadFile();
        } catch (InsufficientDataNotLoadException e) {
            System.err.print(e.getMessage());
            //e.printStackTrace();
        }
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
