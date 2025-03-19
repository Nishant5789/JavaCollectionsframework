package Collectionsframeworkpratice;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // CREATION
        HashMap<String, Integer> stockPrice = new HashMap<>();

        // ADDING ELEMENT
        stockPrice.put("Oracle", 56);
//        return oldvlaue of key if key is present either return null
        System.out.println(stockPrice.put("Oracle", 117));
        System.out.println(stockPrice.put("BMW", 34));
        System.out.println(stockPrice.put("BMW", 36));

        System.out.println(stockPrice.get("or"));
        stockPrice.put("Microsoft", 213);
//       putIfAbsent
        stockPrice.putIfAbsent("Tesla", 120);
        System.out.println(stockPrice.putIfAbsent("Tesla", 130));
        System.out.println("After putIfAbsent: " + stockPrice);

        // putAll
        HashMap<String, Integer> additionalStocks = new HashMap<>();
        additionalStocks.put("Apple", 200);
        additionalStocks.put("Google", 2500);
        // throw nulpointerexcetion is map is null
        stockPrice.putAll(additionalStocks);
        System.out.println("After putAll: " + stockPrice);

        // GETTING ELEMENTS
        System.out.println("Price of Oracle: " + stockPrice.get("Oracle"));
        System.out.println("Price of Tesla (default if absent): " + stockPrice.getOrDefault("Tesla", 100));
        System.out.println("Price of Sony (default if absent): " + stockPrice.getOrDefault("Sony", 100));

//       FREQUENCY MAINTENANCE
        stockPrice.put("Oracle", stockPrice.getOrDefault("Oracle", 0) + 1);
        System.out.println("Updated frequency of Oracle: " + stockPrice.get("Oracle"));
//
//        // REMOVE
        // return value of key if key is not present then return null
        System.out.println(stockPrice.remove("BMW"));
        System.out.println(stockPrice.remove("BMW"));
        System.out.println("After removing BMW: " + stockPrice);

//        // SIZE
        System.out.println("Size of stockPrice map: " + stockPrice.size());

//        // CONTAINS
        System.out.println("Contains key 'Oracle': " + stockPrice.containsKey("Oracle"));
        System.out.println("Contains value 73: " + stockPrice.containsValue(73));

//        // LOOPING THROUGH MAP
        System.out.println("\nLooping using entrySet:");
        // set of Map.Entry<key, value>
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

//         REPLACE METHODS
        System.out.println("\nUsing replace:");
        // replace only if value matches old value
        // return true if oldvalue match & update value & return true or old value is not match then return false
        // return false if key not present
        stockPrice.replace("Microsoft", 213, 220);
        System.out.println(stockPrice.replace("Oracle", 118, 220));
        System.out.println(stockPrice.replace("Oracle", 222, 225));
        System.out.println("After replace with old value check: " + stockPrice);

        stockPrice.replace("Apple", 210); // replace value directly
        System.out.println("After replace without old value check: " + stockPrice);

//        // replaceAll
//        System.out.println("\nUsing replaceAll:");
        stockPrice.replaceAll((key, value) -> value + 10);
        System.out.println("After replaceAll (add 10): " + stockPrice);
//
//        // UNIQUE FEATURES OF HASHMAP
        stockPrice.put(null, 300); // Allows one null key
        stockPrice.put("NullValueExample", null); // Allows multiple null values
        System.out.println("\nAfter adding null key and null value: " + stockPrice);

//        // CLEARING THE MAP
//        stockPrice.clear();
//        System.out.println("After clearing the map: " + stockPrice);
    }
}
