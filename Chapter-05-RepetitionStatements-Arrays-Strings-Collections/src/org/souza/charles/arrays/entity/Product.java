package org.souza.charles.arrays.entity;

public class Product {
    String name;
    String description;
    Double value;

    public Product() {
    }

    public Product(String name, String description, Double value) {
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Product {" +
                "Name = '" + name + '\'' +
                ", Description = '" + description + '\'' +
                ", Value = " + value +
                '}';
    }
}
