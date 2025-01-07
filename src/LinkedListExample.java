import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> oldList = new LinkedList<>();

        oldList.add(10);
        oldList.add(20);
        oldList.add(30);
        LinkedList<Integer> linkedList2 = new LinkedList<>(oldList);

        System.out.println("Old List: " + oldList);
        System.out.println("New List (from Old List): " + linkedList2);

        // ADD ELEMENTS
        linkedList.add(5); // Add at the end
        linkedList.add(10);
        linkedList.add(15);
        linkedList.addFirst(1); // Add at the beginning
        linkedList.addLast(20); // Add at the end
        linkedList.add(2, 7); // Add at a specific index
        linkedList.addAll(oldList); // Add all elements from another LinkedList
        linkedList.addAll(1, oldList); // Add all elements at a specific index

        System.out.println("LinkedList after additions: " + linkedList);

        // FETCHING
        System.out.println("First Element: " + linkedList.getFirst());
        System.out.println("Last Element: " + linkedList.getLast());
        System.out.println("Element at index 2: " + linkedList.get(2));

        // REMOVING
        linkedList.removeFirst(); // Remove the first element
        linkedList.removeLast(); // Remove the last element
        linkedList.remove(3); // Remove element at index 3
        linkedList.remove(Integer.valueOf(25)); // Remove the first occurrence of 25
        linkedList.removeLastOccurrence(10); // Remove the last occurrence of 10

        System.out.println("LinkedList after removals: " + linkedList);

        // SORT
        Collections.sort(linkedList);
        System.out.println("LinkedList after sorting: " + linkedList);
    }
}
