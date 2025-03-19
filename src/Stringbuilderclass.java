
public class Stringbuilderclass {
    public static void main(String[] args) {
        // StringBuilder example
        System.out.println("StringBuilder Example:");
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sc = new StringBuilder(100);
        System.out.println("Original: " + sb);

        // Append
        sb.append(" World");
        System.out.println("After Append: " + sb);

        // Insert
        sb.insert(5, ",");
        System.out.println("After Insert: " + sb);

        // Delete
        sb.delete(5, 6);
        System.out.println("After Delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After Reverse: " + sb);

        // Convert to String
        String sbString = sb.toString();
        System.out.println("Converted to String: " + sbString);

        System.out.println("\nStringBuffer Example:");

        // StringBuffer example
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println("Original: " + sbf);

        // Append
        sbf.append(" Programming");
        System.out.println("After Append: " + sbf);

        // Insert
        sbf.insert(4, " Language");
        System.out.println("After Insert: " + sbf);

        // Delete
        sbf.delete(4, 13);
        System.out.println("After Delete: " + sbf);

        // Replace mcq important
        sbf.replace(0, 4, "Python");
        System.out.println("After Replace: " + sbf);

        // Reverse
        sbf.reverse();
        System.out.println("After Reverse: " + sbf);

        // Capacity
        System.out.println("Capacity: " + sbf.capacity());
    }
}
