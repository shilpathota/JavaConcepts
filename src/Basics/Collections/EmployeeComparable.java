package Basics.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    // Implementing compareTo() method for natural ordering (by age)
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.age, other.age);
    }
}
//Comparator class for custom ordering (by name)
class NameComparator implements Comparator<Employee> {
 @Override
 public int compare(Employee emp1, Employee emp2) {
     return emp1.getName().compareTo(emp2.getName());
 }
}
public class EmployeeComparable {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", 30));
        employeeList.add(new Employee("Alice", 25));
        employeeList.add(new Employee("Bob", 35));

        // Sorting using natural ordering (by age, ascending)
        Collections.sort(employeeList);
        System.out.println("Sorting by age (ascending):");
        for (Employee emp : employeeList) {
            System.out.println(emp.getName() + " - " + emp.getAge());
        }

        // Sorting using custom ordering (by name, descending)
        Comparator<Employee> nameComparator = new NameComparator();
        Collections.sort(employeeList, Collections.reverseOrder(nameComparator));
        System.out.println("\nSorting by name (descending):");
        for (Employee emp : employeeList) {
            System.out.println(emp.getName() + " - " + emp.getAge());
        }
    }
}