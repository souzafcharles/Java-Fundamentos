package org.souza.charles.collections.digitalContentExample;
/**
 * Course title: Java Fundamentos
 * Instructor: Fernando Lima - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 31, 2022
 */
import java.util.*;

public class ExempleCollections {

    public static void main(String[] args) {

        ArrayList cart = new ArrayList();
        Double value = 100.55;
        int value2 = 1;
        int value3;

        cart.add(value);
        cart.add("Grape");
        cart.add(value2);

        System.out.println(cart.get(1));

        value3 = (int) cart.get(2);

        System.out.println(value);

        List<String> cart2 = new ArrayList<String>();

        System.out.println(cart2.isEmpty()); //true

        cart2.add("Apple");
        cart2.add("Strawberry");
        cart2.add("Apple");
        cart2.set(1, "Pear");

        System.out.println(cart2.isEmpty());
        System.out.println(cart2.size());

        System.out.println(cart2.contains("Apple"));
        System.out.println(cart2.indexOf("Apple"));
        System.out.println(cart2.get(cart2.indexOf("Apple")));
        System.out.println(cart2.lastIndexOf("Apple"));

        Set<String> basket = new HashSet<String>();


        //HashSet does not allow repeated items
        System.out.println(basket.isEmpty());
        basket.add("Apple");
        basket.add("Apple");
        basket.add("apple");
        System.out.println(basket.isEmpty());

        System.out.println(basket.size());
        System.out.println(basket);

        Map<String, String> box = new HashMap<String, String>();
        box.put("M2225", "Charles");
        box.put("M2226", "Balthazar");
        box.put("M2227", "Ophélia");

        System.out.println(box.isEmpty());
        System.out.println(box.size());
        System.out.println(box.containsKey("M2225"));
        System.out.println(box.containsValue("Charles"));
        System.out.println(box);
    }
}
