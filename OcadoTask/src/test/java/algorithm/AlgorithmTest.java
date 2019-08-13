package algorithm;

import models.Product;
import models.Results;
import models.ShopItems;
import org.junit.Before;
import org.junit.Test;
import reader.DataReader;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class AlgorithmTest {

    private ArrayList<String> productsIds;
    private ShopItems shopItems;

    private Algorithm algorithm;

    @Before
    public void setUp() {
        productsIds = new ArrayList<>();
        DataReader dataReader = new DataReader();
        String FILE_PATCH = "src/product_data.csv";
        HashMap<String, Product> itemsMap = dataReader.loadProductsFromFile(FILE_PATCH);
        shopItems = new ShopItems(itemsMap);
    }

    @Test
    public void sortAndCalculateBagNumber() {
        productsIds.add("56967011");
        productsIds.add("241714011");
        productsIds.add("56967011");
        productsIds.add("81851011");
        productsIds.add("241714011");
        productsIds.add("65344011");

        algorithm = new Algorithm(3000, shopItems);
        Results results = algorithm.calculateResults(productsIds);
        assertEquals(2, results.getMinBagNumber());
    }
} // class