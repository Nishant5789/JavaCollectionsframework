package Collectionsframeworkpratice;

import java.util.PriorityQueue;

public class PriorityqueueExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue (Min-Heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 1. Adding elements using add() and offer()
        pq.add(40);
        pq.add(10);
        pq.offer(20);
        pq.offer(30);

        // 2. Displaying the head element using peek()
        System.out.println("Peek: " + pq.peek()); // 10 (smallest element)

        // 3. Removing elements using poll() and remove()
        System.out.println("Poll: " + pq.poll()); // Removes 10
        System.out.println("Remove: " + pq.remove()); // Removes 20

        // 4. Checking size and if the queue is empty
        System.out.println("Size: " + pq.size()); // 2
        System.out.println("Is Empty: " + pq.isEmpty()); // false

        // 5. Checking if an element exists using contains()
        System.out.println("Contains 40: " + pq.contains(40)); // true

        // 6. Converting queue to array and printing elements
        Object[] arr = pq.toArray();
        System.out.print("Elements: ");
        for (Object num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 7. Clearing all elements
        pq.clear();
        System.out.println("After clear, is empty: " + pq.isEmpty()); // true
    }
}
