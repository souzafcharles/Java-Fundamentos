package org.souza.charles.digitalContentExample.designPatter.staticKeyword.entities;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 05, 2022
 */
public class TurnstileAccess {

    private static int totalAccess;

    private String name;

    public void enter(String name){
        this.name = name;
        totalAccess = totalAccess + 1;
    }

    public static int retrieveTotal() {
        return totalAccess;
    }
}
