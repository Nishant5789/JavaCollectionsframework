package Collectionsframeworkpratice;

import java.util.ArrayList;
import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        System.out.println("Initial List: " + list);

        // Check the size of the list
        System.out.println("Size of the list: " + list.size());

        // Check if the list contains an element
        System.out.println("Does the list contain 'Banana'? " + list.contains("Banana"));

        // Find the index of an element
        System.out.println("Index of 'Cherry': " + list.indexOf("Cherry"));

        // Find the last index of an element (useful for duplicate entries)
        list.add("Apple");
        System.out.println("List after adding duplicate: " + list);
        System.out.println("Last index of 'Apple': " + list.lastIndexOf("Apple"));

        // Get an element at a specific index
        System.out.println("Element at index 2: " + list.get(2));

        // Set an element at a specific index
        list.set(1, "Blueberry");
        System.out.println("List after setting 'Blueberry' at index 1: " + list);

        // Add an element at a specific position
        list.add(2, "Elderberry");
        System.out.println("List after adding 'Elderberry' at index 2: " + list);

        // Add all elements from another collection
        List<String> newFruits = new ArrayList<>();
        newFruits.add("Fig");
        newFruits.add("Grapes");
        list.addAll(newFruits);
        System.out.println("List after adding new fruits: " + list);

        // Add all elements from another collection at a specific position
        List<String> tropicalFruits = List.of("Mango", "Pineapple");
        list.addAll(3, tropicalFruits);
        System.out.println("List after adding tropical fruits at index 3: " + list);

//        ---- remove() are::::::::
//        boolean remove(Object)
//        Integer remove(int)

        // Remove an element by index
        list.remove(4); // Removes the element at index 4 & return 4
        // Remove an element by value
        System.out.println("List after removing element at index 4: " + list);

        // Remove an element by value
        boolean isRemoved = list.remove("Apple"); // Removes the first occurrence of "Apple"
        System.out.println("List after removing 'Apple': " + list);
        System.out.println("Was 'Apple' removed? " + isRemoved);

//        List<Integer> l = new ArrayList<>(List.of(1, 2, 3));
         List<Integer>  l = new ArrayList<>(Arrays.asList(1,2,3,4,2,2));
         l.remove(Integer.valueOf(2));// remove first occurance
         System.out.println("remove by interger " + l);

         l.removeIf(i-> i==2);// remove all ocuurance
         System.out.println("remove by itrate " + l);
    }
}

