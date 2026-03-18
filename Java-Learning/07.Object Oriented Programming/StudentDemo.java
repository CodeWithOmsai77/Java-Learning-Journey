package Introduction;

import java.util.Scanner;

// Student class represents a blueprint (class) for Student objects
class Student {

    // Instance variables (properties of object)
    String name;
    int age;

    // Method to display student details
    void display() {
        System.out.println();
        System.out.println("My name is "+name+" and my age is "+age);
    }
}

// Main class (entry point of program)
public class StudentDemo {

    // main() is the starting point of execution (JVM starts from here)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an object of Student class. 's1' stores its reference.
       // 'new' creates object in heap memory. 'Student()' its is a constructor call
        Student s1 = new Student();

        System.out.print("Enter the name: ");
        s1.name = sc.next();

        System.out.print("Enter the age: ");
        s1.age = sc.nextInt();

        // Display output
        s1.display();

        // Close scanner
        sc.close();

    }
}
