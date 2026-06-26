package io_nio_playground.src.playground.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("/Users/sumit/Desktop/Example.txt")) {

            int content;

            while ((content = fis.read()) != -1) {
                System.out.print((char) content + " -> " + content + " | ");
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}