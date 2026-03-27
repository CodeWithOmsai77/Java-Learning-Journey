package Introduction;

class Demo {

    void add(int a, int b) {
        System.out.println("Sum of 2 numbers: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of 3 numbers: " + (a + b + c));
    }

    void add(double a, double b) {
        System.out.println("Sum of double: " + (a + b));
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Demo d = new Demo();

        d.add(10, 20);
        d.add(10, 20, 30);
        d.add(5.5, 6.5);
    }
}


////


class Calculator {
// Method 1: Add two integers
int add(int a, int b) {
return a + b;
}
// Method 2: Add three integers
int add(int a, int b, int c) {
return a + b + c;
}
// Method 3: Add two doubles
double add(double a, double b) {
return a + b;
}
}
public class Main {
public static void main(String[] args) {
Calculator c = new Calculator();
System.out.println(c.add(5, 3)); // Output: 8
System.out.println(c.add(5, 3, 2)); // Output: 10
System.out.println(c.add(2.5, 3.5)); // Output: 6.0
}
}
