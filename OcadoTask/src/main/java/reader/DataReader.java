package reader;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import models.Product;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataReader {

    public HashMap<String, Product> loadProductsFromFile(String filePatch) {
        HashMap<String, Product> productMap = new HashMap<>();

        List<String[]> data = new ArrayList<>();

        CSVParser csvParser = new CSVParserBuilder().withSeparator(',').build();

        try (CSVReader csvReader = new CSVReaderBuilder(new FileReader(filePatch))
                .withCSVParser(csvParser).withSkipLines(1).build()) {

            data = csvReader.readAll();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } // catch

        addItemsToItemMap(data, productMap);

        return productMap;
    } // loadProductFromFile


    private void addItemsToItemMap(List<String[]> data, HashMap<String, Product> productMap) {
        for (String[] s : data) {
            String id = s[0];
            String name = s[1];
            String weightUnit = s[3];
            int weight;

            if (weightUnit.equals("KG")) {
                double temporaryWeight = Double.parseDouble(s[2]);
                temporaryWeight *= 1000.0;
                weight = (int) Math.round(temporaryWeight);
            } else {
                weight = Integer.parseInt(s[2]);
            } // else
            productMap.put(id, new Product(id, name, weight));
        } // for (String s : data)
    } // addItemsToItemMap

} // class
