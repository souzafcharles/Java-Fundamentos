package org.souza.charles.digitalContentExample.fileAccess;

import java.io.File;

public class example04 {

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
