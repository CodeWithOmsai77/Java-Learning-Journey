package Introduction;
class Employee {
    int empId;            // Employee ID
    String name;          // Employee Name
    double basicSalary;   // Basic Salary
    double hra, da;       // HRA and DA
    double totalSalary;   // Total Salary

    // Constructor to initialize employee details
    Employee(int id, String n, double basic) {
        empId = id;
        name = n;
        basicSalary = basic;
    }

    // Method to calculate salary
    void calculateSalary() {
        hra = 0.20 * basicSalary;   // HRA = 20% of basic salary
        da = 0.10 * basicSalary;    // DA = 10% of basic salary
        totalSalary = basicSalary + hra + da; // Total Salary calculation
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Salary: " + totalSalary);
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {

        // Creating object of Employee class
        Employee e1 = new Employee(101, "Om", 20000);

        // Calling method to calculate salary
        e1.calculateSalary();

        // Displaying employee details
        e1.display();
    }
}