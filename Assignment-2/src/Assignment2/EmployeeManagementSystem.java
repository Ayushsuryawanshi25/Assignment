package Assignment2;

import java.util.*;
import java.util.regex.*;

public class EmployeeManagementSystem implements EmployeeOperations {

    Scanner sc = new Scanner(System.in);

    HashMap<Integer, Employee> hashMap = new HashMap<>();
    Hashtable<Integer, Employee> hashTable = new Hashtable<>();
    TreeMap<Integer, Employee> treeMap = new TreeMap<>();

    // REGEX Patterns
    Pattern idPattern = Pattern.compile("\\d+");
    Pattern namePattern = Pattern.compile("[A-Za-z ]+");
    Pattern emailPattern = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,6}$");

    @Override
    public void addEmployee() {
        try {
            System.out.print("Enter Employee ID: ");
            String idStr = sc.next();
            if (!idPattern.matcher(idStr).matches())
                throw new Exception("Invalid Employee ID");

            int id = Integer.parseInt(idStr);

            System.out.print("Enter Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            if (!namePattern.matcher(name).matches())
                throw new Exception("Invalid Name");

            System.out.print("Enter Email: ");
            String email = sc.next();
            if (!emailPattern.matcher(email).matches())
                throw new Exception("Invalid Email");

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, email, salary);

            hashMap.put(id, emp);
            hashTable.put(id, emp);
            treeMap.put(id, emp);

            System.out.println("Employee Added Successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void displayEmployees() {
        System.out.println("\n--- HashMap Records ---");
        for (Map.Entry<Integer, Employee> e : hashMap.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }

        System.out.println("\n--- Hashtable Records ---");
        for (Map.Entry<Integer, Employee> e : hashTable.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }

        System.out.println("\n--- TreeMap Records (Sorted) ---");
        for (Map.Entry<Integer, Employee> e : treeMap.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }
    }

    @Override
    public void searchEmployee() {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();

        Employee emp = hashMap.get(id);
        if (emp != null)
            System.out.println("Employee Found: " + emp);
        else
            System.out.println("Employee Not Found!");
    }

    @Override
    public void removeEmployee() {
        System.out.print("Enter Employee ID to remove: ");
        int id = sc.nextInt();

        if (hashMap.containsKey(id)) {
            hashMap.remove(id);
            hashTable.remove(id);
            treeMap.remove(id);
            System.out.println("Employee Removed Successfully!");
        } else {
            System.out.println("Employee Not Found!");
        }
    }

    // Null support demo
    void demonstrateNullSupport() {
        System.out.println("\n--- Null Support Demonstration ---");

        hashMap.put(null, null);
        System.out.println("HashMap allows null key & value");

        try {
            hashTable.put(null, null);
        } catch (Exception e) {
            System.out.println("Hashtable does NOT allow null key/value");
        }

        try {
            treeMap.put(null, null);
        } catch (Exception e) {
            System.out.println("TreeMap does NOT allow null key");
        }
    }

    public static void main(String[] args) {

        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Employee Management Menu =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. Null Support Demo");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ems.addEmployee();
                    break;
                case 2:
                    ems.displayEmployees();
                    break;
                case 3:
                    ems.searchEmployee();
                    break;
                case 4:
                    ems.removeEmployee();
                    break;
                case 5:
                    ems.demonstrateNullSupport();
                    break;
                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}

// Interface
interface EmployeeOperations {
    void addEmployee();
    void displayEmployees();
    void searchEmployee();
    void removeEmployee();
}

// Employee class
class Employee {
    int id;
    String name;
    String email;
    double salary;

    Employee(int id, String name, String email, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Email: " + email +
               ", Salary: " + salary;
    }
}
