package delivery;

import java.io.BufferedReader;

public abstract class Product {
    private String name;
    private double price;
    private String producer;

    public Product() {
        this.name = "undefined";
        this.price = 0;
        this.producer = "undefined";
    }

    public Product(String name, double price, String producer) {
        this.name = name;
        this.price = price;
        this.producer = producer;
    }

    abstract String getType();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double p) {this.price = p;}

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public abstract void readFromFile(BufferedReader br);

    @Override
    public String toString() {
        return  "name=" + name +
                ", price=" + price +
                ", producer=" + producer;
    }
}
