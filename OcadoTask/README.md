**Requirements:** Gradle

**Configuration**

1. Enter project directory
2. Enter the following command in terminal: `$ gradle build`
3. Enter the following command in terminal to run test: `$ ./gradlew test`

**How to get results:**
1. Create instance of `DataReader`,
2. Create HashMap<String, Product> Using `DataReader` method `loadProductsFromFile(String filePatch)`
3. Create `ShopItems` instance using created HashMap as a parameter
4. Create `Algorithm` instance passing `bagCapacity` and created `ShopItems` instance as parameters
5. Run `Algorithm` method `calculateResults(ArrayList<String> itemsIdList)` passing list of items in basket as parameter

**Results interpretation:**

`calculateResults(ArrayList<String> itemsIdList)`  method returns `Results` instance.
From this instance you can extract:
 - Minimum number of bags required to pack all items passed to algorithm in point 5
 using `getMinBagNumber()`
 - Information about what items are packed to each bag using `getProductsInBags()`
 - List of `Bag` instances which you can use to obtain further information about `Products`
 
**Zadanie 2:**

- brak informacji co robić z produktem, który jest za cięzki żeby zapakować go do pustej torby
- brak informacji jak zachować się w sytuacji powtarzających się ID przedmiotów


