package org.souza.charles.string.class02;
/**
 * Course title: Java Fundamentos
 * Instructor: Fernando Lima - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 31, 2022
 */

import java.util.Arrays;

public class
StringExamples02 {

    public static void main(String[] args) {

        String name = new String("apple");
        String name2 = new String("Apple");
        String name3 = new String("apple");

        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name.equalsIgnoreCase(name3));

        boolean test = (name == name3);
        System.out.println(test);

        String name4 = "apple";
        String name5 = "apple";

        test = (name4 == name5);
        System.out.println(test);

        String description = new String("Gala apple. the sweetest apple on the market!");

        System.out.println(description.length());

        System.out.println(description.startsWith("Apple"));
        System.out.println(description.endsWith("!"));

        System.out.println(description.charAt(1));

        System.out.println(description.indexOf("G"));
        System.out.println(description.indexOf("Gala"));

        System.out.println(description.indexOf("a"));
        System.out.println(description.lastIndexOf("a"));

        System.out.println(description.replace("G", "g"));
        System.out.println(description.replace("Gala", "Fuji"));
        System.out.println(description.replace("a", "A"));

        System.out.println(description.split(" ").length);
        System.out.println(Arrays.toString(description.split(" ")));

        System.out.println(description.toUpperCase());
        System.out.println(description.toLowerCase());

        System.out.println(description.substring(0, 4));
        System.out.println(description.substring(4));

        System.out.println(description.substring(
                            description.indexOf("Gala"),
                            description.indexOf(" ")));

        System.out.println(description);
    }
}

