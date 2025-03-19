package Collectionsframeworkpratice;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

public class Abstractmap {
        public static void main(String[] args) {
            // Create a list of AbstractMap.SimpleEntry
            List<AbstractMap.SimpleEntry<Integer, Integer>> list = new ArrayList<>();

            // Add entries to the list
            list.add(new AbstractMap.SimpleEntry<>(1, 2));
            list.add(new AbstractMap.SimpleEntry<>(3, 4));
            list.add(new AbstractMap.SimpleEntry<>(5, 6));

            // Access elements from the list
            for (AbstractMap.SimpleEntry<Integer, Integer> entry : list) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }

            // Access a specific entry
            AbstractMap.SimpleEntry<Integer, Integer> firstEntry = list.get(0);
            System.out.println("First Entry - Key: " + firstEntry.getKey() + ", Value: " + firstEntry.getValue());
        }
}
