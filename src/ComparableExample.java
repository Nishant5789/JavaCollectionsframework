import java.util.*;

class Employees implements Comparable<Employees> {
    private int id;
    private String name;

    public Employees(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Define natural ordering by ID
    @Override
    public int compareTo(Employees other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Employees{id=" + id + ", name='" + name + "'}";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Employees> Employeess = new ArrayList<>();
        Employeess.add(new Employees(3, "Alice"));
        Employeess.add(new Employees(1, "Bob"));
        Employeess.add(new Employees(2, "Charlie"));

        Collections.sort(Employeess); // Uses Comparable
        System.out.println("Employeess sorted by ID: " + Employeess);
    }
}
