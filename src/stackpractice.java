import java.util.Stack;

public class stackpractice {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Push elements onto the Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after push operations: " + stack);

        // Peek at the top element (does not remove it)
        int topElement = stack.peek();
        System.out.println("Element at the top (peek): " + topElement);

        // Pop an element from the Stack
        int removedElement = stack.pop();
        System.out.println("Element removed using pop(): " + removedElement);
        System.out.println("Stack after pop(): " + stack);

        // Check if the Stack is empty
        boolean isEmpty = stack.empty();
        System.out.println("Is the Stack empty? " + isEmpty);

        // Get the size of the Stack
        int size = stack.size();
        System.out.println("Size of the Stack: " + size);

        // Search for an element in the Stack
        // Returns the 1-based position from the top or -1 if not found
        int position = stack.search(10);
        if (position != -1) {
            System.out.println("Element 10 found at position (1-based): " + position);
        } else {
            System.out.println("Element 10 not found in the Stack.");
        }
        // Add more elements
        stack.push(40);
        stack.push(50);
        System.out.println("Stack after adding more elements: " + stack);
        // Clear the Stack
        stack.clear(); // Clears all elements from the Stack
        System.out.println("Stack after clear(): " + stack);
        // Check again if the Stack is empty
        System.out.println("Is the Stack empty after clear()? " + stack.empty());
    }
}
