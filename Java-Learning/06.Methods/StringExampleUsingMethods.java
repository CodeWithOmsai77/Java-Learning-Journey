import java.util.Scanner;

public class StringExampleUsingMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String message = Greet();
//        System.out.println(message);
//        int ans = sum3(20, 40);


// Calling the method and passing the name "omsai dasari" as an argument
// The returned value from the method will be stored in the variable 'personalized'
        System.out.println("Enter your name: ");
        String name = in.next();
        String personalized = myGreet(name);
        // Printing the greeting message returned by the method
        System.out.println(personalized);
    }
    // Method definition
// static → allows the method to be called directly from main()
// String → this method returns a String value
// myGreet → method name
// (String name) → parameter that receives the value passed during method call
    static String myGreet(String name) {
        String message = "Hello " + name; // Creating a greeting message by combining "Hello" with the given name
        return message;
    }


//    static int sum3(int a, int b) {
//        int sum = a + b;
//        return sum;
//
//    }


    static String Greet() {
        String greeting = "How are you";

        return greeting;

    }


}
