package java8features;

import java.util.*;
import java.util.stream.Collectors;

public class sortedpratice {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 9, 1, 7);

        // Sort in descending order
        List<Integer> sortedDescending = numbers.stream()
                .sorted((a, b) -> b - a)//put empty
                .collect(Collectors.toList());
        System.out.println("Sorted Numbers (Descending): " + sortedDescending);

        // sort a object by single attribute
        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Alice", 22),
                new Person("Bob", 30)
        );

        // Sort by age in ascending order
        List<Person> sortedByAge = people.stream()
                .sorted((p1, p2) -> Integer.compare(p1.age, p2.age))
                .collect(Collectors.toList());

        System.out.println("Sorted by Age: " + sortedByAge);

        // Sort by name in alphabetical order
        List<Person> sortedByName = people.stream()
                .sorted((p1, p2) -> p1.name.compareTo(p2.name))
                .collect(Collectors.toList());
//        List<Person> sortedByName = people.stream().sorted(Comparator.comparing(Person::name)).collect(Collectors.toList());

        System.out.println("Sorted by Name: " + sortedByName);
    }
}


class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

}

