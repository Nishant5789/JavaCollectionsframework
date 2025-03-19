package Streamspratice.Roughpratice;

import java8features.Employee;
import java8features.EmployeeDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class streampratice1 {
    public static void main(String[] args)
    {
        List<Employee> employees = EmployeeDataBase.getAllEmployees();
        Map<Integer, String> result1 = employees.stream().filter(e->e.getDept().equals("Development"))
                .collect(Collectors.toMap(e->e.getId(),    e->e.getName()));

//        result1.entrySet().forEach(e-> System.out.println(e.getKey()+ " " +e.getValue()));
//        result1.entrySet().forEach(System.out::println);

        List<String> result2 = employees.stream().flatMap(e->e.getProjects().stream())
                .map(p->p.getName()).distinct().collect(Collectors.toList());
//        result2.forEach(System.out::println);

        List<String> result3 = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).map(Employee::getName).collect(Collectors.toList());
        List<Number> result4 = employees.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary))).map(Employee::getSalary).collect(Collectors.toList());
//        result4.forEach(System.out::println);

        Map<String, List<Employee>> result5 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender));

//        result5.entrySet().forEach(System.out::println);

        Map<String, List<String>> result6 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.mapping(Employee::getName, Collectors.toList())));

//        result6.entrySet().forEach(System.out::println);

        Optional<Employee> highestPaidEmployees = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

         System.out.println("Highest paid employee : "+highestPaidEmployees.get().getProjects().stream().map(p->p.getName()).collect(Collectors.toList()));

        Employee findFirstElement = employees.stream().filter(e->e.getDept().equals("Development"))
                .findFirst().orElseThrow(()->new IllegalArgumentException("Employee not found "));

        System.out.println(findFirstElement.getName());
    }
}
