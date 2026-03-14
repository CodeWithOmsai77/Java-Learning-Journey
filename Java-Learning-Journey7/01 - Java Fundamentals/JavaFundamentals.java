import java.util.Scanner;

public class JavaFundamentals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // user take the input from the user
//        int a = 10;
//        if (a == 10) {
//            System.out.println("Hello world" + a);

// Variable in JAVA :- A variable is a named memory location used to store data in a program.

           int age = 20;
           float height = 5.9f;
           char grade = 'A';
           boolean isStudent = true;

           System.out.println(age);
           System.out.println(height);
           System.out.println(grade);
           System.out.println(isStudent);

//   Data types in JAVA :- A data type tells the Java compiler what type of value a variable can store.
//   the int is the data type in the above program

//  Operators in JAVA :- An operator is a symbol used to perform operations on variables or values. int c = a + b;

        int a = 10;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

//  Type Casting :- Type casting means converting one data type into another data type.
//        public class Main {
//            public static void main(String[] args) {

                int h = 10;
                double i = a;   // automatic conversion

                System.out.println(a);
                System.out.println(b);

//  user input :-
//import java.util.Scanner;
//
//        public class Main {
//            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter your age: ");
                int ge = sc.nextInt();

                System.out.println("Your age is: " + age);

            }
        }







