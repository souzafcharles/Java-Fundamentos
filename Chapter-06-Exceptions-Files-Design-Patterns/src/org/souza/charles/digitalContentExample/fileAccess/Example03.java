package org.souza.charles.digitalContentExample.fileAccess;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 04, 2022
 */
import java.io.File;
import java.io.IOException;

public class Example03 {

    public static void main(String[] args) {

        File file = new File("file.txt");

        if (file.exists()) {
            System.out.println("File exists!"+
                    " It can be read: " + file.canRead() +
                    " Can be written: " + file.canWrite() +
                    " Size: " + file.length() +
                    " Path: " + file.getPath());
        } else {
            try {
                if (file.createNewFile())
                    System.out.println("File created!");
                else
                    System.out.println("File not created!");
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
