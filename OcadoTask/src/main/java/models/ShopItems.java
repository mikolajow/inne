package models;

import java.util.HashMap;


public class ShopItems {

    private HashMap<String, Product> productMap;


    public ShopItems(HashMap<String, Product> productMap) {
        this.productMap = productMap;
    } // constructor


    public HashMap<String, Product> getProductMap() {
        return productMap;
    } // getProductMap

} // class


































