package models;

public class Product {

    private String id;
    private String name;
    private int gramWeight;

    public Product(String id, String name, int weightInGrams) {
        this.id = id;
        this.name = name;
        this.gramWeight = weightInGrams;
    } // constructor


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGramWeight() {
        return gramWeight;
    }

} // class
