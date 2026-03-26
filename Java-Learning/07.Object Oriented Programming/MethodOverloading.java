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