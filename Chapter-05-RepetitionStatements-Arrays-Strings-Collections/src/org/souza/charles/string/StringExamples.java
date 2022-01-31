package org.souza.charles.string;

public class StringExamples {

    public static void main(String[] args) {

        String name01;
        name01 = new String();
        name01 = "Apple";
        System.out.println(name01);

        String name02 = new String("Apple");
        System.out.println(name02);

        String name03 = "Apple";
        System.out.println(name03);

        String description = "The Gala type: \nThe apple is the sweetest on the market";
        System.out.println(description);
        description = "The Gala type: \tThe apple is the sweetest on the market";
        System.out.println(description);
        description = "The Gala type: \"The apple is the sweetest on the market\"";
        System.out.println(description);

        String newDescription = new String();
        newDescription = "Gala type, the sweetest apple on the market";

        String advertisement = name01 + " " + newDescription;
        System.out.println(advertisement);

        advertisement = name01.concat(" ").concat(newDescription);
        System.out.println(advertisement);

        advertisement += "!";
        System.out.println(advertisement);
    }
}
