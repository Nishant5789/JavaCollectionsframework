import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // CREATION
        TreeSet<Integer> treeSet = new TreeSet<>();

        // ADD ELEMENTS
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(30);
        System.out.println("TreeSet after additions: " + treeSet);

        // ADD ALL ELEMENTS FROM ANOTHER COLLECTION
        TreeSet<Integer> anotherSet = new TreeSet<>();
        anotherSet.add(60);
        anotherSet.add(70);
        treeSet.addAll(anotherSet);
        System.out.println("TreeSet after adding all from another set: " + treeSet);

        // FETCHING ELEMENTS
        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());

        // LOWER, HIGHER, FLOOR, CEILING
        System.out.println("Element lower than 40: " + treeSet.lower(40));
        System.out.println("Element higher than 40: " + treeSet.higher(40));
        System.out.println("Element equal to or lower than 40: " + treeSet.floor(40));
        System.out.println("Element equal to or higher than 40: " + treeSet.ceiling(40));

        // REMOVE ELEMENTS
        treeSet.remove(20); // Remove specific element
        System.out.println("TreeSet after removing 20: " + treeSet);

        // POLL METHODS
        System.out.println("Poll First Element: " + treeSet.pollFirst());
        System.out.println("Poll Last Element: " + treeSet.pollLast());
        System.out.println("TreeSet after polling: " + treeSet);

        // SUBSET, HEADSET, TAILSET
        System.out.println("Subset (10 to 50, exclusive): " + treeSet.subSet(10, 50));
        System.out.println("HeadSet (elements less than 50): " + treeSet.headSet(50));
        System.out.println("TailSet (elements greater than or equal to 30): " + treeSet.tailSet(30));

        // SIZE AND EMPTY CHECK
        System.out.println("Size of TreeSet: " + treeSet.size());
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        // CLEAR ALL ELEMENTS
        treeSet.clear();
        System.out.println("TreeSet after clearing: " + treeSet);
    }
}
