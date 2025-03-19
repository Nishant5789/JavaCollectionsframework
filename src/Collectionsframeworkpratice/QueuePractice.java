package Collectionsframeworkpratice;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // Add elements to the Queue
        queue.add(10); // Add element 10
        queue.add(20); // Add element 20
        queue.add(30); // Add element 30
        System.out.println("Queue after adding elements: " + queue);

        // Remove the head of the Queue (throws exception if empty)
        int removedElement = queue.remove();
        System.out.println("Element removed using remove(): " + removedElement);
        System.out.println("Queue after remove(): " + queue);

        // Poll the head of the Queue (returns null if empty)
        Integer polledElement = queue.poll();
        System.out.println("Element removed using poll(): " + polledElement);
        System.out.println("Queue after poll(): " + queue);

        // Peek at the head of the Queue without removing it
        Integer head = queue.peek();
        System.out.println("Element at the head using peek(): " + head);

        // Get the size of the Queue
        int size = queue.size();
        System.out.println("Size of the Queue: " + size);

        // Try polling an empty queue
        queue.clear(); // Clear the Queue
        System.out.println("\nQueue cleared. Attempting operations on an empty queue...");

        // Poll returns null if the queue is empty
        Integer emptyPoll = queue.poll();
        System.out.println("Result of poll() on empty queue: " + emptyPoll);

        // Remove throws exception if the queue is empty
        try {
            queue.remove();
        } catch (Exception e) {
            System.out.println("Exception on remove() from empty queue: " + e.getMessage());
        }

        // Peek returns null if the queue is empty
        Integer emptyPeek = queue.peek();
        System.out.println("Result of peek() on empty queue: " + emptyPeek);
    }
}
