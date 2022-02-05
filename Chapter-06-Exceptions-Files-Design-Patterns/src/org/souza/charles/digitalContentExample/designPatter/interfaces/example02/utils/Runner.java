package org.souza.charles.digitalContentExample.designPatter.interfaces.example02.utils;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 05, 2022
 */

public interface Runner {

    void run(int velocity);

    default void stop(){
        System.out.println("Stopping...");
    }

    static void accelerate(){
        System.out.println("Accelerating");
    }
}

