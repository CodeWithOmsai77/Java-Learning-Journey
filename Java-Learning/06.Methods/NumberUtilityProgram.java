import java.util.Scanner;   // Import Scanner class for user input

public class NumberUtilityProgram {

    // Method to find factorial of a number
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Method to check whether a number is prime
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;       // Not a prime number
            }
        }
        return true;                // Prime number
    }

    // Method to display first 50 prime numbers
    static void displayPrimes() {
        int count = 0;
        int number = 2;

        while (count < 50) {
            if (isPrime(number)) {
                System.out.print(number + "\t");
                count++;
                if(count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
        System.out.println();
    }

    // Method to find sum and average
    static void sumAndAverage(int n) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            sum = sum + num;
        }

        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Factorial
        System.out.print("Enter a number for factorial: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " = " + factorial(num));

        // First 50 primes
        System.out.println("\nFirst 50 Prime Numbers:");
        displayPrimes();

        // Sum and average
        System.out.print("\nEnter how many numbers: ");
        int n = sc.nextInt();
        sumAndAverage(n);
    }
}