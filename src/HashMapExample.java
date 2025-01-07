import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // CREATION
        HashMap<String, Integer> stockPrice = new HashMap<>();

        // ADDING ELEMENT
        stockPrice.put("Oracle", 56);
        stockPrice.put("Oracle", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);

        // putIfAbsent
        stockPrice.putIfAbsent("Tesla", 120);
        System.out.println("After putIfAbsent: " + stockPrice);

        // putAll
        HashMap<String, Integer> additionalStocks = new HashMap<>();
        additionalStocks.put("Apple", 200);
        additionalStocks.put("Google", 2500);
        stockPrice.putAll(additionalStocks);
        System.out.println("After putAll: " + stockPrice);

        // GETTING ELEMENTS
        System.out.println("Price of Oracle: " + stockPrice.get("Oracle"));
        System.out.println("Price of Tesla (default if absent): " + stockPrice.getOrDefault("Tesla", 100));
        System.out.println("Price of Sony (default if absent): " + stockPrice.getOrDefault("Sony", 100));

        // FREQUENCY MAINTENANCE
        stockPrice.put("Oracle", stockPrice.getOrDefault("Oracle", 0) + 1);
        System.out.println("Updated frequency of Oracle: " + stockPrice.get("Oracle"));

        // REMOVE
        stockPrice.remove("BMW");
        System.out.println("After removing BMW: " + stockPrice);

        // SIZE
        System.out.println("Size of stockPrice map: " + stockPrice.size());

        // CONTAINS
        System.out.println("Contains key 'Oracle': " + stockPrice.containsKey("Oracle"));
        System.out.println("Contains value 73: " + stockPrice.containsValue(73));

        // LOOPING THROUGH MAP
        System.out.println("\nLooping using entrySet:");
        for (Map.Entry<String, Integer> entry : stockPrice.entrySet()) {
            System.out.println("Company: " + entry.getKey() + ", Price: " + entry.getValue());
        }

        System.out.println("\nLooping using keySet:");
        Set<String> keys = stockPrice.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key);
        }

        System.out.println("\nLooping using values:");
        Collection<Integer> values = stockPrice.values();
        for (Integer value : values) {
            System.out.println("Value: " + value);
        }

        // REPLACE METHODS
        System.out.println("\nUsing replace:");
        stockPrice.replace("Microsoft", 213, 220); // replace only if value matches old value
        System.out.println("After replace with old value check: " + stockPrice);

        stockPrice.replace("Apple", 210); // replace value directly
        System.out.println("After replace without old value check: " + stockPrice);

        // replaceAll
        System.out.println("\nUsing replaceAll:");
        stockPrice.replaceAll((key, value) -> value + 10);
        System.out.println("After replaceAll (add 10): " + stockPrice);

        // UNIQUE FEATURES OF HASHMAP
        stockPrice.put(null, 300); // Allows one null key
        stockPrice.put("NullValueExample", null); // Allows multiple null values
        System.out.println("\nAfter adding null key and null value: " + stockPrice);

        // CLEARING THE MAP
        stockPrice.clear();
        System.out.println("After clearing the map: " + stockPrice);
    }
}
