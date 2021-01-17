package com.virtusa.sanuka.exceptionHandlling.wrapException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileLoader {

    public static void main(String[] args) {
        try {
            loadFile();
        } catch (IllegalStateException e) {
            System.err.print(e.getMessage());
            //e.printStackTrace();
        }
    }

    private static void loadFile() throws IllegalStateException {
        try {
            FileInputStream file;
            file = new FileInputStream("./filee.txt");
            System.out.println("file load successfully");
        } catch ( FileNotFoundException e) {
            throw new IllegalStateException("File not found exception wrap to Illegal State Exception",e);
        }
    }
}
