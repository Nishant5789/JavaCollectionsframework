package Streamspratice.Praticeworkspace;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.*;

public class StreamApiWithGroupby2 {
    public static void main(String[] args) {
        // Create sample data
        List<Comppany> companies = createSampleData();

        // 1. Flat Mapping: Collect all employees across all companies into one list
        List<Emplloyee> allEmployees = companies.stream()
                .flatMap(company -> company.getDepartments().stream()
                        .flatMap(department -> department.getEmployees().stream()))
                .collect(Collectors.toList());
        System.out.println("All Employees: " + allEmployees);

        // 2. CollectingAndThen: Find the total number of employees and convert the result
        long totalEmployees = companies.stream()
                .flatMap(company -> company.getDepartments().stream()
                        .flatMap(department -> department.getEmployees().stream()))
                .collect(Collectors.collectingAndThen(Collectors.counting(), Long::intValue));
        System.out.println("\nTotal Number of Employees: " + totalEmployees);

        // 3. Filtering: Get a list of employees with a salary above 60,000
        Map<String, List<Emplloyee>> highEarnersByCompany = companies.stream()
                .collect(Collectors.groupingBy(Comppany::getName,
                        Collectors.flatMapping(company -> company.getDepartments().stream()
                                .flatMap(department -> department.getEmployees().stream())
                                .filter(emp -> emp.getSalary() > 60000), Collectors.toList())));
        System.out.println("\nHigh Earners by Comppany: " + highEarnersByCompany);

        // 4. Reducing: Calculate the total salary of all employees
        double totalSalary = companies.stream()
                .flatMap(company -> company.getDepartments().stream()
                        .flatMap(department -> department.getEmployees().stream()))
                .collect(Collectors.reducing(0.0, Emplloyee::getSalary, Double::sum));
        System.out.println("\nTotal Salary: " + totalSalary);

        // 5. ToMap: Map department names to their employee count
        Map<String, Long> employeeCountByDepartment = companies.stream()
                .flatMap(company -> company.getDepartments().stream())
                .collect(Collectors.toMap(Deppartment::getName,
                        dept -> dept.getEmployees().stream().count()));
        System.out.println("\nEmplloyee Count by Deppartment: " + employeeCountByDepartment);

        // 6. ToConcurrentMap: Similar to toMap, but for concurrent use
        ConcurrentMap<String, Double> avgSalaryByDepartment = companies.stream()
                .flatMap(company -> company.getDepartments().stream())
                .collect(Collectors.toConcurrentMap(Deppartment::getName,
                        dept -> dept.getEmployees().stream()
                                .collect(Collectors.averagingDouble(Emplloyee::getSalary))));
        System.out.println("\nAverage Salary by Deppartment (Concurrent): " + avgSalaryByDepartment);

        // 7. GroupingByConcurrent: Group employees by their company in parallel
        ConcurrentMap<String, List<Emplloyee>> employeesByCompany = companies.stream()
                .collect(Collectors.groupingByConcurrent(Comppany::getName,
                        Collectors.flatMapping(company -> company.getDepartments().stream()
                                .flatMap(department -> department.getEmployees().stream()), Collectors.toList())));
        System.out.println("\nEmployees by Comppany (Concurrent): " + employeesByCompany);
    }

    // Method to create sample data
    private static List<Comppany> createSampleData() {
        Emplloyee e1 = new Emplloyee("Alice", 75000);
        Emplloyee e2 = new Emplloyee("Bob", 60000);
        Emplloyee e3 = new Emplloyee("Charlie", 90000);
        Emplloyee e4 = new Emplloyee("Diana", 50000);
        Emplloyee e5 = new Emplloyee("Eve", 65000);

        Deppartment d1 = new Deppartment("Engineering", List.of(e1, e2));
        Deppartment d2 = new Deppartment("HR", List.of(e3));
        Deppartment d3 = new Deppartment("Sales", List.of(e4, e5));

        Comppany c1 = new Comppany("TechCorp", List.of(d1, d2));
        Comppany c2 = new Comppany("InnoSoft", List.of(d3));

        return List.of(c1, c2);
    }
}

// Emplloyee class
class Emplloyee {
    private String name;
    private double salary;

    public Emplloyee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " ($" + salary + ")";
    }
}

// Deppartment class
class Deppartment {
    private String name;
    private List<Emplloyee> employees;

    public Deppartment(String name, List<Emplloyee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public List<Emplloyee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Comppany class
class Comppany {
    private String name;
    private List<Deppartment> departments;

    public Comppany(String name, List<Deppartment> departments) {
        this.name = name;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public List<Deppartment> getDepartments() {
        return departments;
    }

    @Override
    public String toString() {
        return name;
    }
}
