package org.souza.charles.digitalContentExample.fileAccess;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 04, 2022
 */
import java.io.File;
import java.io.IOException;

public class example05 {

    public static void main(String[] args) {

        File directory = new File("charles");

        if (directory.exists()){
            System.out.println("Directory exists!");
        }else{
            if (directory.mkdir())
                System.out.println("Directory created!");
            else
                System.out.println("Directory not created.");
        }

        File file = new File(directory,"file.txt");
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
