
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ItratoinofList {
    public static void main(String[] args) {
        // Create a List
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("1. Using for loop (Index-Based):");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\n2. Using Enhanced for loop:");
        for (String element : list) {
            System.out.println(element);
        }

        System.out.println("\n3. Using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n4. Using ListIterator (Forward and Backward):");
        ListIterator<String> listIterator = list.listIterator();
        System.out.println("Forward Traversal:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("Backward Traversal:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("\n5. Using forEach() with Lambda Expression:");
        list.forEach(element -> System.out.println(element));

        System.out.println("\n6. Using forEach() with Method Reference:");
        list.forEach(System.out::println);

        System.out.println("\n7. Using Streams:");
        list.stream().forEach(System.out::println);

        System.out.println("\n8. Using Parallel Streams:");
        list.parallelStream().forEach(System.out::println);
    }
}
