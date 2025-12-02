package Emp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {

	private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n=== Employee Management System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter a valid number.");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1: addEmployee(); break;
                case 2: viewEmployees(); break;
                case 3: updateEmployee(); break;
                case 4: deleteEmployee(); break;
                case 5: System.out.println("Exiting... Thank you!"); break;
                default: System.out.println("Invalid Choice! Try again.");
            }

        } while (choice != 5);
    }


    // Add Employee
    public static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);
        employees.add(emp);

        System.out.println("Employee Added Successfully!");
    }


    // View All Employees
    public static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found!");
        } else {
            System.out.println("\n--- Employee List ---");
            for (Employee emp : employees) {
                emp.display();
            }
        }
    }


    // Update Employee
    public static void updateEmployee() {
        System.out.print("Enter Employee ID to Update: ");
        int id = sc.nextInt();

        for (Employee emp : employees) {
            if (emp.getId() == id) {
                sc.nextLine();
                System.out.print("Enter New Name: ");
                String name = sc.nextLine();

                System.out.print("Enter New Salary: ");
                double salary = sc.nextDouble();

                emp.setName(name);
                emp.setSalary(salary);

                System.out.println("Employee Updated Successfully!");
                return;
            }
        }

        System.out.println("Employee with ID " + id + " not found!");
    }


    // Delete Employee
    public static void deleteEmployee() {
        System.out.print("Enter Employee ID to Delete: ");
        int id = sc.nextInt();

        for (Employee emp : employees) {
            if (emp.getId() == id) {
                employees.remove(emp);
                System.out.println("Employee Deleted Successfully!");
                return;
            }
        }

        System.out.println("Employee with ID " + id + " not found!");
    }
}
