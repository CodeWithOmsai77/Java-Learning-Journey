import java.util.Scanner;

// syntax:
// static returnType methodName() {
    // code }
// static void sum() {
//    // code }

public class SumUsingMethods {
    public static void main(String[] args) {

        // Calling the method that will calculate the sum
//        sum1();


        // Calling the method Sum2() and storing the returned value in variable 'ans'
        int ans = Sum2();
        System.out.println(ans); // Printing the value returned by the method


    }

    // return a value
    // Method that returns a value
    // static → allows this method to be called directly from main()
    // int → this method will return an integer value
    static int Sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;

        return sum; // Returning the calculated sum back to main()
    }

    // static method
    // static is used because main() is static and it can directly call another static method
    // void means this method does not return any value
    static void sum1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;

        System.out.println(sum);
    }
}

