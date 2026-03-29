import java.util.Scanner;

// Base class
class Employee {
    int empId;
    String name;
    double salary;
    String address;

    // Constructor to initialize Employee data
    Employee(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

// Derived class
class Teacher extends Employee {
    String department;
    String subject;

    // Constructor to initialize Teacher + Employee data
    Teacher(int empId, String name, double salary, String address,
            String department, String subject) {

        super(empId, name, salary, address); // calling base constructor
        this.department = department;
        this.subject = subject;
    }

    // Display method
    void display() {
        System.out.println("\n--- Teacher Details ---");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subject: " + subject);
    }
}

// Main class
public class TeacherDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Array of objects
        Teacher t[] = new Teacher[n];

        // Input details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Teacher " + (i + 1) + ":");

            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            // Create object using constructor
            t[i] = new Teacher(id, name, salary, address, dept, subject);
        }

        // Display all teachers
        System.out.println("\n===== Teacher Details =====");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }

        sc.close();
    }
}