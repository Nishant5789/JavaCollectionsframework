import java.util.Map;
import java.util.TreeMap;

public class TreemapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // 1. Adding elements using put()
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(5, "Five");
        treeMap.put(15, "Fifteen");

        System.out.println("TreeMap after put operations: " + treeMap);

        // 2. Accessing elements using get()
        System.out.println("Value for key 10: " + treeMap.get(10));

        // 3. Removing an element using remove()
        treeMap.remove(15);
        System.out.println("TreeMap after removing key 15: " + treeMap);

        // 4. Using firstKey() and lastKey()
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());

        // 5. Using ceilingKey() and floorKey()
        System.out.println("Ceiling Key for 12: " + treeMap.ceilingKey(12)); // Smallest key >= 12
        System.out.println("Floor Key for 12: " + treeMap.floorKey(12));   // Largest key <= 12

        // 6. Using higherKey() and lowerKey()
        System.out.println("Higher Key for 10: " + treeMap.higherKey(10)); // Key > 10
        System.out.println("Lower Key for 10: " + treeMap.lowerKey(10));  // Key < 10

        // 7. Using keySet() to get all keys
        System.out.println("Keys: " + treeMap.keySet());

        // 8. Using values() to get all values
        System.out.println("Values: " + treeMap.values());

        // 9. Using entrySet() to iterate through key-value pairs
        System.out.println("Key-Value pairs:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 10. Using subMap() to get a range of keys
        System.out.println("SubMap from 5 (inclusive) to 20 (exclusive): " + treeMap.subMap(5, 20));
    }

}
