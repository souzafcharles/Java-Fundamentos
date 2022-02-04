package org.souza.charles.digitalContentExample.fileAccess;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 04, 2022
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class example02 {

    public static void main(String[] args) {

        try {
            FileReader stream = new FileReader("file.txt");
            BufferedReader reader = new BufferedReader(stream);

            String line = reader.readLine();
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
            stream.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
