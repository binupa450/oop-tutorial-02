package uk.ac.westminster.products_api;

public class Product {

    private long id;
    private String name;
    private double price;

    // No-argument constructor
    public Product() {
    }

    // Parameterized constructor
    public Product(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters
    public long getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public double getPrice() {
          return price;
    }
}
