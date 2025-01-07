import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creation of TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding elements using put
        treeMap.put("Cherry", 40);
        treeMap.put("Apple", 50);
        treeMap.put("Banana", 30);
        treeMap.put("Elderberry", 60);
        treeMap.put("Date", 70);
        System.out.println("TreeMap: " + treeMap);

        // Creating a reverse-order TreeMap
        TreeMap<String, Integer> reverseMap = new TreeMap<>(Comparator.reverseOrder());
        reverseMap.putAll(treeMap);
        System.out.println("Reverse TreeMap: " + reverseMap);

        // Accessing elements
        System.out.println("Value for key 'Cherry': " + treeMap.get("Cherry"));

        // Removing elements
        treeMap.remove("Banana");
        System.out.println("After removing 'Banana': " + treeMap);

        // First and Last keys and entries
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("First Entry: " + treeMap.firstEntry());
        System.out.println("Last Key: " + treeMap.lastKey());
        System.out.println("Last Entry: " + treeMap.lastEntry());

        // Replacing elements
        treeMap.replace("Date", 75);
        treeMap.replace("Cherry", 40, 45); // Replace only if old value matches
        System.out.println("After replacing values: " + treeMap);

        // Creating TreeMap from an existing HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Fig", 20);
        hashMap.put("Grape", 25);
        TreeMap<String, Integer> treeMapFromHashMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap from HashMap: " + treeMapFromHashMap);

        // Creating TreeMap from another TreeMap
        TreeMap<String, Integer> treeMapFromTreeMap = new TreeMap<>(reverseMap);
        System.out.println("TreeMap from another TreeMap: " + treeMapFromTreeMap);

        // Iterating through TreeMap
        System.out.println("\nIterating using entrySet:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Thread-safe TreeMap using Collections.synchronizedMap
        Map<String, Integer> synchronizedTreeMap = Collections.synchronizedMap(treeMap);
        synchronized (synchronizedTreeMap) {
            System.out.println("\nSynchronized TreeMap: " + synchronizedTreeMap);
        }
    }
}
