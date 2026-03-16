import java.util.Scanner;

// syntax:
// static returnType methodName() {
    // code }
// static void sum() {
//    // code }

public class SumUsingMethods {
    public static void main(String[] args) {// main() is the starting point of every Java program

        // Calling the method that will calculate the sum
        SumUsingMethods();
        SumUsingMethods();
        SumUsingMethods();
    }
    // static method
    // static is used because main() is static and it can directly call another static method
    // void means this method does not return any value
    static void SumUsingMethods() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;

        System.out.println(sum);
    }
}
