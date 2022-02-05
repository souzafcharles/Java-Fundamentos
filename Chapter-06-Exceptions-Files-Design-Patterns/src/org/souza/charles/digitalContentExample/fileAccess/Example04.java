package org.souza.charles.digitalContentExample.fileAccess;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 04, 2022
 */
import java.io.File;

public class Example04 {

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
    }
}
