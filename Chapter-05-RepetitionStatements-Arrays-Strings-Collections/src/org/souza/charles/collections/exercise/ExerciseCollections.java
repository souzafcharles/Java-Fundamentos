package org.souza.charles.collections.exercise;
/**
 * Course title: Java Fundamentos
 * Instructor: Fernando Lima - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 01, 2022
 */
import java.util.*;

public class ExerciseCollections {

    public static void main(String[] args) {

        ArrayList list01 = new ArrayList();
        list01.add("LTP");
        list01.add("Web");
        list01.add("Algorithms");
        list01.forEach(l -> System.out.println(l));
        System.out.println("---------------------");

        ArrayList list02 = new ArrayList();
        list02.add("LTP");
        list02.add("Web");
        list02.set(1,"Algorithms");
        list02.forEach(l -> System.out.println(l));
        System.out.println("---------------------");

        ArrayList list03 = new ArrayList();
        list03.add("LTP");
        list03.add("Web");
        list03.add("Algorithms");
        list03.remove(1);
        list03.forEach(l -> System.out.println(l));
        System.out.println("---------------------");

        ArrayList list04 = new ArrayList();
        list04.add("LTP");
        list04.add("Web");
        list04.add("Algorithms");
        System.out.println(list04.get(1));
        System.out.println("---------------------");

        ArrayList list05 = new ArrayList();
        list05.add("LTP");
        list05.add("Web");
        list05.add("Algorithm");

        for (int i = 0; i < list05.size(); i++) {
            System.out.println(list05.get(i));
        }
        System.out.println("---------------------");

        ArrayList list06 = new ArrayList();
        list06.add("LTP");
        list06.add("Web");
        list06.add("Algorithm");

        int index = list06.indexOf("Web");
        System.out.println("The value \"Web\" is at position: " + index);

        System.out.println("---------------------");

        HashSet courses = new HashSet<>();

        courses.add("Java");
        courses.add(".NET");
        courses.add("Android");

        courses.add("Java");

        System.out.println(courses);

        System.out.println("---------------------");

        HashMap map = new HashMap();

        map.put("RM1234", "Charles");
        map.put("RM4321", "Ophelia");
        map.put("RM5678", "Balthazar");

        System.out.println(map);
        System.out.println(map.get("RM1234"));

        map.remove("RM1234");

        System.out.println(map.get("RM1234"));

        System.out.println("---------------------");

        ArrayList<Client> listaClient = new ArrayList<Client>();

        Client client1 = new Client();
        client1.setName("Epaminondas");
        Client client2 = new Client();
        client2.setName("Guerino");

        listaClient.add(client1);
        listaClient.add(client2);

        for (int i = 0; i < listaClient.size(); i++) {
            Client cli = listaClient.get(i);
            System.out.println(cli.getName());
        }
    }
}
