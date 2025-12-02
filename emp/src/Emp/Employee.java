package Emp;

// Employee Class
class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display Employee Details
    public void display() {
        System.out.println("--------------------------------");
        System.out.println("Employee ID    : " + id);
        System.out.println("Employee Name  : " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("--------------------------------");
    }
}




    