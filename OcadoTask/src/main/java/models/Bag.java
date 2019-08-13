package models;

import java.util.ArrayList;

public class Bag {

    private ArrayList<Product> productIdList;
    private int capacityLeft;

    public Bag(int startingCapacity) {
        this.capacityLeft = startingCapacity;
        this.productIdList = new ArrayList<>();
    } // constructor

    public void addProductToBag(Product newProduct) {
        this.capacityLeft -= newProduct.getGramWeight();
        this.productIdList.add(newProduct);
    } // addProductToBag

    @Override
    public String toString() {
        String message = "Produkty = ";
        for (Product product : productIdList) {
            message += product.getId() + ",";
        } // for
        message += " pozostałe miejsce = " + getCapacityLeft();
        return message;
    } // toString

    public int getCapacityLeft() {
        return capacityLeft;
    } // getCapacityLeft

} // class





































