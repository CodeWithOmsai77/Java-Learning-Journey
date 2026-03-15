// write a java program to sort a list of integers and the list of names using arrays and strings.

import java.util.Scanner;

public class SortArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //---integer array----
        System.out.print("Enter number of integers: ");
        int n = in.nextInt();

        int[] number = new int[n];

        System.out.println("Enter the integers: ");
        for (int i = 0 ; i < n ; i++) {
            number[i] = in.nextInt();
        }

        //---Sorting integer (Bubble sort)---
        for (int i = 0 ; i < n - 1 ; i++) {
            for (int j = 0 ; j < n - 1 - i ; j++) {
                if (number[j] > number [j+1]) {
                    int temp = number[j];
                    number[j] = number [j+1];
                    number[j+1] = temp;
                }
            }
        }
        System.out.println("\nSorted list: ");
        for (int i = 0 ; i < n ; i++) {
            System.out.print(number[i] + " ");
        }

        // ---String Array---
        System.out.print("\nEnter number of names: ");
        int m = in.nextInt();
        in.nextLine(); // consume new line

        String[] names = new String[m];

        System.out.println("Enter the names: ");
        for (int i  = 0 ; i < m ; i++) {
            names[i] = in.nextLine();
        }

        //---Sorting the names (Alphabetical Order)---
        for (int i = 0 ; i < m - 1; i++) {
            for ( int j = 0 ; j < m - 1 - i ; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }
        System.out.println("\nSorted names: ");
        for (int i = 0 ; i < m ; i++) {
            System.out.println(names[i]);
        }
        in.close();
    }
}
