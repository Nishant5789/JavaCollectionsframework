import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input a String (single word)
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.println("You entered the word: " + word);

        // Input a String (whole line)
        scanner.nextLine(); // Consume the leftover newline
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("You entered the sentence: " + sentence);

        // Input an Integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered the number: " + number);

        // Input a Floating-Point Number
        System.out.print("Enter a decimal number: ");
        double decimal = scanner.nextDouble();
        System.out.println("You entered the decimal number: " + decimal);

        // Input a Character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        System.out.println("You entered the character: " + character);

        // Input a Boolean
        System.out.print("Enter true or false: ");
        boolean boolValue = scanner.nextBoolean();
        System.out.println("You entered the boolean value: " + boolValue);

        // Input Multiple Integers
        System.out.print("Enter three integers separated by spaces: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("You entered: " + a + ", " + b + ", " + c);

        // Input an Array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Input Until End of File (EOF)
        System.out.println("Enter data (Ctrl+D to stop):");
        scanner.nextLine(); // Consume the leftover newline
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println("You entered: " + input);
        }
        // Close the scanner
        scanner.close();
    }
}
