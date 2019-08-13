package reader;

import models.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class DataReaderTest {

    private HashMap<String, Product> testItemsMap;
    final String FILE_PATCH = "src/product_data.csv";

    @Before
    public void setUp() throws Exception {
        DataReader dataReader = new DataReader();
        testItemsMap = dataReader.loadProductsFromFile(FILE_PATCH);
    }

    @Test
    public void loadProductListFromFile() {
        assertEquals(142, testItemsMap.size());
        assertEquals("Lean Beef Steak Mince 5% Fat", testItemsMap.get("77760011").getName());
        assertEquals("Melon Slices", testItemsMap.get("353901011").getName());
        assertEquals("Asparagus, Green Beans & Tenderstem Broccoli", testItemsMap.get("89135011").getName());

        assertEquals(300, testItemsMap.get("64510011").getGramWeight());
        assertEquals(350, testItemsMap.get("65254011").getGramWeight());
        assertEquals(2500, testItemsMap.get("65275011").getGramWeight());
        assertEquals(1200, testItemsMap.get("65353011").getGramWeight());
    }

} // class