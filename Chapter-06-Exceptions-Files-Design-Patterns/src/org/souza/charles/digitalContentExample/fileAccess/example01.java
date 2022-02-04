package org.souza.charles.digitalContentExample.fileAccess;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class example01 {
    public static void main(String[] args) {
        try {
            FileWriter stream = new FileWriter("file.txt");
            PrintWriter print = new PrintWriter(stream);

            print.println("Test");
            print.println("Writing to file");

            print.close();
            stream.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
