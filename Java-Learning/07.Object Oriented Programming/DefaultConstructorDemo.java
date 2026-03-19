// it is a default constructor program

class Student {
    String name;
    int age;

    void display() {
        System.out.println("My name is "+name+" and my age is "+age+".");
    }
}

public class DefaultConstructorDemo {
    public static void main(String[] args) {

        Student s1 = new Student(); // Default Constructor
        s1.name = "omsai";
        s1.age = 20;

        s1.display();
    }

}
