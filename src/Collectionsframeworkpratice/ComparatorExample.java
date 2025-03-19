package Collectionsframeworkpratice;

import java.util.*;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Collectionsframeworkpratice.Employee{id=" + id + ", name='" + name + "'}";
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getId(), e2.getId());
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Alice"));
        employees.add(new Employee(1, "Bob"));
        employees.add(new Employee(2, "Charlie"));

        // Sort by Name using Comparator
        Collections.sort(employees, new NameComparator());
        System.out.println("Collectionsframeworkpratice.Employees sorted by Name: " + employees);

        // using lamda expression
        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println("Collectionsframeworkpratice.Employees sorted by Name: " + employees);

        // Sort by ID using Comparator
        Collections.sort(employees, new IdComparator());
        System.out.println("Collectionsframeworkpratice.Employees sorted by ID: " + employees);
    }
}
