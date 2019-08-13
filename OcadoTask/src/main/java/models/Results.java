package models;

import java.util.List;

public class Results {

    private int minBagNumber;
    private String productsInBags;
    private List<Bag> bagsWithProducts;

    public Results(int minBagNumber, String productsInBags, List<Bag> bagsWithProducts) {
        this.minBagNumber = minBagNumber;
        this.productsInBags = productsInBags;
        this.bagsWithProducts = bagsWithProducts;
    } // constructor

    public int getMinBagNumber() {
        return minBagNumber;
    }

    public String getProductsInBags() {
        return productsInBags;
    }

    public List<Bag> getBagsWithProducts() {
        return bagsWithProducts;
    }
} // class models.Results
