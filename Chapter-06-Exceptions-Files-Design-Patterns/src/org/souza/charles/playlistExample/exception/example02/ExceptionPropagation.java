package org.souza.charles.playlistExample.exception.example02;
/**
 * Course title: Java Fundamentos
 * Instructor: Fernando Lima - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 05, 2022
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionPropagation {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("basket-file.txt");

        PrintWriter print = new PrintWriter(fw);
        print.println("Apple = R$ 4.00");
        print.println("Strawberry = R$ 6.00");
        print.println("Total = BRL R$ 10.00");
        print.close();
        fw.close();
    }
}
