package org.souza.charles.digitalContentExample.designPatter.finalKeyword.geometryExample;
/**
 * Course title: Java Fundamentos
 * Example adapted by: Charles Fernandes de Souza
 * Date: February 04, 2022
 */
public class Circle {

    private final double PI_NUMBER = 3.1416;

    private double radius;

    public double calculateArea(){
        return PI_NUMBER*radius*radius;
    }

    public double getRay() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}