public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello, Java Programming!";
        String anotherStr = "hello, java programming!";

        // 1. Length of the string
        System.out.println("Length: " + str.length());

        // 2. Character at a specific index
        System.out.println("Character at index 7: " + str.charAt(7));

        // 3. Substring
        System.out.println("Substring (7 to 11): " + str.substring(7, 11));

        // 4. Equals
        System.out.println("Equals another string: " + str.equals(anotherStr));

        // 5. Equals ignoring case
        System.out.println("Equals ignoring case: " + str.equalsIgnoreCase(anotherStr));

        // 6. Compare strings lexicographically
        System.out.println("Compare strings: " + str.compareTo(anotherStr));

        // 7. Convert to lower case
        System.out.println("To Lower Case: " + str.toLowerCase());

        // 8. Convert to upper case
        System.out.println("To Upper Case: " + str.toUpperCase());

        // 9. Check if a string starts with a prefix
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));

        // 10. Check if a string ends with a suffix
        System.out.println("Ends with '!': " + str.endsWith("!"));

        // 11. Index of a character
        System.out.println("Index of 'J': " + str.indexOf('J'));

        // 12. Last index of a character
        System.out.println("Last Index of 'a': " + str.lastIndexOf('a'));

        // 13. Replace characters
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // 14. Trim whitespace
        String strWithSpaces = "   Trimmed String   ";
        System.out.println("Trimmed String: '" + strWithSpaces.trim() + "'");

        // 15. Split string into array
        String[] words = str.split(" ");
        System.out.println("Split into words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 16. Check if a string contains another string
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // 17. Check if a string is empty
        String emptyStr = "";
        System.out.println("Is empty: " + emptyStr.isEmpty());
        System.out.println("Is empty: " + emptyStr.isBlank());
        System.out.println("Is empty: " + emptyStr.length());
//        if(emptyStr.length()==0)
        System.out.println("Is empty: " + emptyStr.equals(""));


        // 18. Concatenate strings
        String greeting = "Welcome to ";

        System.out.println("Concatenated String: " + greeting.concat("Java World"));
        System.out.println("but not change actual string value "+greeting);

        // 19. String join (with delimiter)
        String joinedStr = String.join(", ", "Apple", "Banana", "Cherry");
        System.out.println("Joined String: " + joinedStr);

        // 20. Convert string to char array
        char[] charArray = str.toCharArray();
        System.out.println("Char Array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 21. Convert primitive to String (valueOf)
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("String from int: " + numStr);

        // 22. Format a string
        String formattedStr = String.format("Hello, %s! You have %d messages.", "User", 5);
        System.out.println("Formatted String: " + formattedStr);
    }
}
