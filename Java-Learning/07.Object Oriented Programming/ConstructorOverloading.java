package Introduction;

class DemoStudent {
    int id;
    String name;

    // Default Constructor
    DemoStudent() {
        id = 78;
        name = "rahul";
    }

    // Parameterized Constructor (1 parameter)
    DemoStudent(int i) {
        id = i;
        name = "Omsai";
    }

    // Parameterized Constructor (2 parameters)
    DemoStudent(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        DemoStudent s1 = new DemoStudent();            // calls default constructor
        DemoStudent s2 = new DemoStudent(101);         // calls 1-parameter constructor
        DemoStudent s3 = new DemoStudent(102, "Om");   // calls 2-parameter constructor

        s1.display();
        s2.display();
        s3.display();
    }
}