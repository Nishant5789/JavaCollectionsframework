package Collectionsframeworkpratice;

import java.util.*;
import java.util.stream.Collectors;

public class Listoflist {
    public static void main(String[] args) {
        // Declare and initialize List of Lists
        List<List<Integer>> listOfLists = new ArrayList<>();

        // Traversing List of Lists using enhanced for loop
        System.out.println("\nTraversing using enhanced for loop:");
        for (List<Integer> innerList : listOfLists) {
            for (int num : innerList) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Accessing a specific element (2nd row, 3rd column)
        int element = listOfLists.get(1).get(2);
        System.out.println("\nAccessed element at 2nd row, 3rd column: " + element);

        // Adding an element to the first inner list
        listOfLists.get(0).add(99);
        System.out.println("\nFirst list after adding 99: " + listOfLists.get(0));

        // Removing an element from the second inner list (index 2)
        listOfLists.get(1).remove(2);
        System.out.println("\nSecond list after removing element at index 2: " + listOfLists.get(1));

        // Check if an element exists in the first inner list
        boolean contains = listOfLists.get(0).contains(3);
        System.out.println("\nDoes the first list contain 3? " + contains);

        // Flatten the List of Lists into a single List
        List<Integer> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("\nFlattened List: " + flatList);

        // Sorting each inner list
        listOfLists.forEach(innerList -> Collections.sort(innerList));
        System.out.println("\nList of Lists after sorting each inner list:");
        listOfLists.forEach(innerList -> System.out.println(innerList));
    }
}

