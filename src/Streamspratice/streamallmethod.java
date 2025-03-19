package Streamspratice;

import java.util.*;
import java.util.stream.*;

public class streamallmethod {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. filter(): Filter out even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // 2. map(): Square each number
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squared Numbers: " + squaredNumbers);

        // 3. sorted(): Sort the numbers in descending order
        List<Integer> sortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted Numbers (Descending): " + sortedNumbers);

        // 4. distinct(): Remove duplicate elements
        List<Integer> distinctNumbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5).stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct Numbers: " + distinctNumbers);

        // 5. limit(): Get the first 5 numbers
        List<Integer> limitedNumbers = numbers.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("First 5 Numbers: " + limitedNumbers);

        // 6. skip(): Skip the first 5 numbers
        List<Integer> skippedNumbers = numbers.stream()
                .skip(5)
                .collect(Collectors.toList());
        System.out.println("Skipped First 5 Numbers: " + skippedNumbers);

        // 7. reduce(): Find the sum of all numbers
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of Numbers: " + sum);

        // 8. collect(): Group numbers into even and odd
//        Map<Boolean, List<Integer>> groupedByEvenOdd = numbers.stream()
//                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
//        System.out.println("Grouped By Even/Odd: " + groupedByEvenOdd);

        // 9. anyMatch(): Check if any number is greater than 8
        boolean anyGreaterThan8 = numbers.stream()
                .anyMatch(n -> n > 8);
        System.out.println("Any Number Greater Than 8: " + anyGreaterThan8);

        // 10. allMatch(): Check if all numbers are positive
        boolean allPositive = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println("All Numbers Positive: " + allPositive);

        // 11. noneMatch(): Check if no number is negative
        boolean noneNegative = numbers.stream()
                .noneMatch(n -> n < 0);
        System.out.println("No Negative Numbers: " + noneNegative);

        // 12. count(): Count total numbers
        long count = numbers.stream()
                .count();
        System.out.println("Count of Numbers: " + count);

        // 13. peek(): Debugging - Print numbers while processing
        List<Integer> debugNumbers = numbers.stream()
                .peek(n -> System.out.println("Processing Number: " + n))
                .collect(Collectors.toList());

        // 14. flatMap(): Flatten nested lists
        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );
        List<Integer> flatList = nestedLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println("Flattened List: " + flatList);

        // 15. findFirst(): Get the first element
        Optional<Integer> firstNumber = numbers.stream()
                .findFirst();
        System.out.println("First Number: " + firstNumber.orElse(-1));

        // 16. findAny(): Get any element (useful in parallel streams)
        Optional<Integer> anyNumber = numbers.parallelStream()
                .findAny();
        System.out.println("Any Number: " + anyNumber.orElse(-1));

        // 17. forEach(): Print each number
        System.out.print("All Numbers: ");
        numbers.stream()
                .forEach(n -> System.out.print(n + " "));
    }
}
