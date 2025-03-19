package Streamspratice.Praticeworkspace;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Comparator;

public class StreamApiWithGroupby1 {
    public static void main(String[] args) {
        // Sample Data
        Company techCorp = new Company("TechCorp", "New York");
        Company innoSoft = new Company("InnoSoft", "San Francisco");

        Department engineering = new Department("Engineering", "John Smith");
        Department hr = new Department("HR", "Alice Johnson");
        Department sales = new Department("Sales", "Robert Brown");

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", techCorp, engineering, 70000),
                new Employee("Bob", techCorp, engineering, 80000),
                new Employee("Charlie", techCorp, hr, 60000),
                new Employee("Diana", innoSoft, engineering, 75000),
                new Employee("Eve", innoSoft, hr, 65000),
                new Employee("Frank", innoSoft, sales, 55000),
                new Employee("Grace", techCorp, sales, 50000)
        );

        // 1. Grouping Employees by Company
        Map<Company, List<Employee>> employeesByCompany = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCompany));
        System.out.println("Employees Grouped by Company:");
        employeesByCompany.forEach((company, emps) -> System.out.println(company + ": " + emps));

        // 2. Counting Employees in Each Department
        Map<Department, Long> employeeCountByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("\nEmployee Count by Department:");
        employeeCountByDepartment.forEach((dept, count) ->
                System.out.println(dept + ": " + count));

        // 3. Grouping and Mapping to Employee Names by Company
        Map<Company, List<String>> employeeNamesByCompany = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCompany,
                        Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println("\nEmployee Names Grouped by Company:");
        employeeNamesByCompany.forEach((company, names) ->
                System.out.println(company.getName() + ": " + names));

        // 4. Summing Salaries in Each Department
        Map<Department, Integer> totalSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingInt(Employee::getSalary)));
        System.out.println("\nTotal Salary by Department:");
        totalSalaryByDepartment.forEach((dept, totalSalary) ->
                System.out.println(dept + ": " + totalSalary));

        // 5. Averaging Salaries by Department
        Map<Department, Double> averageSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingInt(Employee::getSalary)));
        System.out.println("\nAverage Salary by Department:");
        averageSalaryByDepartment.forEach((dept, avgSalary) ->
                System.out.println(dept + ": " + avgSalary));

        // 6. Finding the Highest Paid Employee in Each Company
        Map<Company, Optional<Employee>> highestPaidByCompany = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCompany,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println("\nHighest Paid Employee by Company:");
        highestPaidByCompany.forEach((company, emp) ->
                System.out.println(company + ": " + emp.orElse(null)));

        // 7. Nested Grouping: Group Employees by Company, then by Department
        Map<Company, Map<Department, List<Employee>>> employeesByCompanyAndDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCompany,
                        Collectors.groupingBy(Employee::getDepartment)));
        System.out.println("\nEmployees Grouped by Company and Department:");
        employeesByCompanyAndDepartment.forEach((company, deptMap) -> {
            System.out.println(company + ":");
            deptMap.forEach((dept, emps) -> System.out.println("  " + dept + ": " + emps));
        });

        // 8. Minimum Salary in Each Department
        Map<Department, Optional<Employee>> lowestPaidByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        System.out.println("\nLowest Paid Employee by Department:");
        lowestPaidByDepartment.forEach((dept, emp) ->
                System.out.println(dept + ": " + emp.orElse(null)));
    }
}

class Company {
    private String name;
    private String location;

    public Company(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return name + " (Location: " + location + ")";
    }
}

class Department {
    private String name;
    private String head;

    public Department(String name, String head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public String getHead() {
        return head;
    }

    @Override
    public String toString() {
        return name + " (Head: " + head + ")";
    }
}

class Employee {
    private String name;
    private Company company;
    private Department department;
    private int salary;

    public Employee(String name, Company company, Department department, int salary) {
        this.name = name;
        this.company = company;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public Department getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " (Salary: " + salary + ")";
    }
}

