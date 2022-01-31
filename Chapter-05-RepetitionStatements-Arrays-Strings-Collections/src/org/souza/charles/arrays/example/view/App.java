package org.souza.charles.arrays.example.view;
/**
 * Course title: Java Fundamentos
 * Instructor: Leandro Rubim - FIAP
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 30, 2022
 */
import org.souza.charles.arrays.example.entity.Product;

public class App {
    public static void main(String[] args) {

        Product[] products = new Product[2];

        Product product01 = new Product();
        product01.setName("Lemon");
        product01.setDescription("Galician");
        product01.setValue(4.00);

        Product product02 = new Product();
        product02.setName("Apple");
        product02.setDescription("Gala");
        product02.setValue(5.00);

        products[0] = product01;
        products[1] = product02;

        for (Product product : products) {
            System.out.println(product.toString());
        }

        Product[][] productLocalization = new Product[10][3];

        productLocalization[0][1] = product01;
        productLocalization[1][1] = product02;

        System.out.println(productLocalization[0][1].getName());
    }
}
