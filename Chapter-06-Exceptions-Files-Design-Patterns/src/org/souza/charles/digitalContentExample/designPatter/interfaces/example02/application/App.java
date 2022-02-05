package org.souza.charles.digitalContentExample.designPatter.interfaces.example02.application;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 05, 2022
 */
import org.souza.charles.digitalContentExample.designPatter.interfaces.example02.entities.Animal;
import org.souza.charles.digitalContentExample.designPatter.interfaces.example02.entities.Ostrich;
import org.souza.charles.digitalContentExample.designPatter.interfaces.example02.utils.Runner;

public class App {

    public static void main(String[] args) {

        Runner ostrich = new Ostrich();

        if (ostrich instanceof Runner){
            System.out.println("It's a runner");
        }else{
            System.out.println("Not a runner");
        }
        if (ostrich instanceof Animal){
            System.out.println("It's an animal");
        }else{
            System.out.println("Not an animal");
        }
    }
}
