package java8features;
import java.util.*;
import java.util.stream.Collectors;

public class mapoperatoins {
    public static void main(Integer[] args) {
                Map<String, Integer> map = new HashMap<>();
                map.put("John", 25);
                map.put("Alice", 22);
                map.put("Bob", 30);
                map.put("David", 28);

                // Sort by keys in ascending order
                Map<String, Integer> sortedByKeyAsc = map.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue,
                                LinkedHashMap::new
                        )); 

                // Sort by keys in descending order
                Map<String, Integer> sortedByKeyDesc = map.entrySet()
                        .stream()
                        .sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue,
                                LinkedHashMap::new
                        ));

                // Sort by values in ascending order
                Map<String, Integer> sortedByValueAsc = map.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue,
                                LinkedHashMap::new
                        ));

                // Sort by values in descending order
                Map<String, Integer> sortedByValueDesc = map.entrySet()
                        .stream()
                        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue,
                                LinkedHashMap::new
                        ));

                // Print results
                System.out.println("Original Map: " + map);
                System.out.println("Sorted by Keys Ascending: " + sortedByKeyAsc);
                System.out.println("Sorted by Keys Descending: " + sortedByKeyDesc);
                System.out.println("Sorted by Values Ascending: " + sortedByValueAsc);
                System.out.println("Sorted by Values Descending: " + sortedByValueDesc);
            }

    public static void main(String[] args) {
    }
}
