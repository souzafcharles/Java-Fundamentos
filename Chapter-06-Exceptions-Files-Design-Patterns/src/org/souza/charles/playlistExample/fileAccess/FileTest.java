package org.souza.charles.playlistExample.fileAccess;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 05, 2022
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileTest {

    public static void main(String[] args) {
        String filename = "stock.csv";
        String directory = System.getProperty("user.home");
        String path = directory + "\\" + filename;

        List<String> content = new ArrayList<String>();
        content.add("Product; Quantity; Unit of Measure; Unit Value;");
        content.add("Pear; 200; pct; R$ 5.40;");
        content.add("Strawberry; 400; cx; R$ 6.50;");
        content.add("Pineapple; 280; one; R$ 5.00;");

        recordStock(filename, path, content);
        readStock(path);

        File file = new File(path);

        if(file.exists()) {
            System.out.println("Path exists!"+
                    "\nCan be read: " + file.canRead() +
                    "\nCan be written: " + file.canWrite() +
                    "\nSize: " + file.length() +
                    "\nPath: " + file.getPath());
        } else {

            try {
                if(file.createNewFile()) {
                    System.out.println("File created!");
                } else {
                    System.out.println("File not created!");
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }

        File fDirectory = new File(directory);
        if(fDirectory.exists()) {
            System.out.println("Directory exists");
        }
    }

    private static void recordStock(String filename, String path, List<String> content) {
        FileWriter stream;
        PrintWriter print;

        try {
            stream = new FileWriter(path);

            print = new PrintWriter(stream);

            for (String line: content) {

                print.println(line);
            }
            print.close();
            stream.close();

            System.out.println("The file "+ filename + " was saved in "+ path);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void readStock(String path) {
        try {
            FileReader stream = new FileReader(path);
            BufferedReader reader = new BufferedReader(stream);

            String line = reader.readLine();

            while (line !=null) {
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


