package org.souza.charles.entities;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 27, 2022
 */

public class Account {
    public int number;
    public double balance;

    public Client client = new Client();
}
