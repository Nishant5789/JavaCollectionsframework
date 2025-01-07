package Collectionsframework.src;

import java.util.*;

public class Collectionspratice
{
    public static void main(String[] args) {
        // Create a List
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Banana", "Apple", "Cherry", "Date", "Elderberry");

        // Print the initial list
        System.out.println("Initial List: " + list);

        // Sort the list in natural order
        Collections.sort(list);
        System.out.println("List after sorting: " + list);

        // Sort the list in reverse order
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("List after reverse sorting: " + list);

        // Shuffle the list
        Collections.shuffle(list);
        System.out.println("List after shuffling: " + list);

        // Find the maximum element
        String max = Collections.max(list);
        System.out.println("Maximum element: " + max);

        // Find the minimum element
        String min = Collections.min(list);
        System.out.println("Minimum element: " + min);

        // Replace all elements with a single value
        Collections.fill(list, "Grapes");
        System.out.println("List after fill operation: " + list);

        // Reset the list for further operations
        list.clear();
        Collections.addAll(list, "Banana", "Apple", "Cherry", "Date", "Elderberry");
        System.out.println("Reset List: " + list);

        // Copy elements from one list to another
        List<String> destination = new ArrayList<>(Collections.nCopies(list.size(), ""));
        Collections.copy(destination, list);
        System.out.println("Copied List: " + destination);

        // Rotate the list by a given distance
        Collections.rotate(list, 2);
        System.out.println("List after rotation by 2: " + list);

        // Swap two elements in the list
        Collections.swap(list, 0, 2);
        System.out.println("List after swapping index 0 and 2: " + list);

        // Frequency of an element
        int frequency = Collections.frequency(list, "Apple");
        System.out.println("Frequency of 'Apple': " + frequency);

        // Check if two lists are disjoint
        List<String> otherList = List.of("Fig", "Grapes");
        boolean disjoint = Collections.disjoint(list, otherList);
        System.out.println("Are the lists disjoint? " + disjoint);

        // Create an unmodifiable view of the list
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println("Unmodifiable List: " + unmodifiableList);

        // Uncomment the below line to see the UnsupportedOperationException
        // unmodifiableList.add("New Fruit"); // Throws exception

        // Binary search (list must be sorted)
        Collections.sort(list);
        int index = Collections.binarySearch(list, "Cherry");
        System.out.println("Index of 'Cherry' after binary search: " + index);
    }

}
