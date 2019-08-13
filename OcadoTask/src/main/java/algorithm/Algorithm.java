package algorithm;

import models.Bag;
import models.Product;
import models.Results;
import models.ShopItems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Algorithm {

    private ShopItems shopItems;
    private ArrayList<Product> productsInBasket;
    private List<Bag> bagList;
    private int bagCapacity;

    public Algorithm(int startingBagCapacity, ShopItems shopItems) {

        this.shopItems = shopItems;

        this.bagCapacity = startingBagCapacity;
        bagList = new ArrayList<>();
        bagList.add(new Bag(startingBagCapacity));

    } // constructor


    public Results calculateResults(ArrayList<String> itemsIdList) {
        this.productsInBasket = new ArrayList<>();
        for (String itemId : itemsIdList) {
            this.productsInBasket.add(shopItems.getProductMap().get(itemId));
        } // for (String itemId : itemsIdList)
        sortProductsInBasket();

        for (Product currentProduct : productsInBasket) {

            int bagIndex;
            for ( bagIndex = 0; bagIndex < bagList.size(); bagIndex++) {
                Bag currentBag = bagList.get(bagIndex);
                if (currentBag.getCapacityLeft() >= currentProduct.getGramWeight()) {
                    currentBag.addProductToBag(currentProduct);
                    // when we find a place for current item we stop looking for suitable bag
                    break;
                } // if
            } // for - looking for place for currentItem

            // if there is not enough place in bags we create new models.Bag and add current item there
            if (bagIndex == bagList.size() && currentProduct.getGramWeight() <= this.bagCapacity) {
                bagList.add(new Bag(this.bagCapacity));
                bagList.get(bagList.size()-1).addProductToBag(currentProduct);
            } // if (bagIndex = bagList.size())

        } // for - adding product to bag

        String productsInBags = "";

        for (int i = 0; i < bagList.size(); i++) {
            int bagNumber = i+1;
            productsInBags += "torba numer " + bagNumber + " " + bagList.get(i).toString() + "\n";
        }

        Results results = new Results(bagList.size(), productsInBags, bagList);

        return results;
    } // calculateResults


    private void sortProductsInBasket() {
        Comparator<Product> productWeightComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getGramWeight() - o1.getGramWeight();
            } // compare
        }; // comparator constructor

        this.productsInBasket.sort(productWeightComparator);
    } // sortProductsInBasker

} // class































