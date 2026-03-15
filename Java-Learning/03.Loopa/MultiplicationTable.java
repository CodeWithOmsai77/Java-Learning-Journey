import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println("Table of "+ n + ":");
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println( n + "X" + i + "=" + (i * n));
        }
    }
}
