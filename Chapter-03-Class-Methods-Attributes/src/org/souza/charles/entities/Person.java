package org.souza.charles.entities;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 29, 2022
 */

import java.io.Serializable;

public class Person implements Serializable {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
