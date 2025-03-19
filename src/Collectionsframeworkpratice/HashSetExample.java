package Collectionsframeworkpratice;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // CREATION
        HashSet<Integer> set = new HashSet<>();
        // ADD ELEMENTS
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println("HashSet after additions: " + set);

        // ADD ALL ELEMENTS FROM ANOTHER COLLECTION
        HashSet<Integer> anotherSet = new HashSet<>();
        anotherSet.add(50);
        anotherSet.add(60);
        set.addAll(anotherSet);
        System.out.println("HashSet after adding all from another set: " + set);

        // CHECK IF ELEMENT EXISTS
        System.out.println("HashSet contains 20: " + set.contains(20));
        System.out.println("HashSet contains 100: " + set.contains(100));

        // REMOVE ELEMENTS
        set.remove(20); // Remove a specific element
        System.out.println("HashSet after removing 20: " + set);

        // REMOVE ALL ELEMENTS FROM ANOTHER COLLECTION
        set.removeAll(anotherSet);
        System.out.println("HashSet after removing all from another set: " + set);

        // ITERATE THROUGH ELEMENTS
        System.out.println("Iterating over HashSet:");
        for (Integer element : set) {
            System.out.println(element);
        }

        // SIZE
        System.out.println("Size of HashSet: " + set.size());

        // CLEAR ALL ELEMENTS
        set.clear();
        System.out.println("HashSet after clearing: " + set);

        // CHECK IF EMPTY
        System.out.println("Is HashSet empty? " + set.isEmpty());
    }
}
