package org.souza.charles.zoo.application;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 29, 2022
 */
import org.souza.charles.zoo.entities.Animal;
import org.souza.charles.zoo.entities.Dogs;
public class AppTest {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setEat("All animals eat");
        animal.setMove("All animals move");

        Dogs dog = new Dogs();
        dog.setEat("Dog eats dog food");
        dog.setMove("Dog uses 4 legs");
        dog.setBark("Dog goes Au Au");

        Animal poodle = new Dogs();
        poodle.setEat("Poodle eats dog food");
        poodle.setMove("Poodle moves");
    }
}
