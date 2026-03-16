// Practical - 06. Java program to add two matrices using a 2-Dimensional Array.

// Name :- Omsai Ganesh Dasari

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = in.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        // Input First matrix
        System.out.println("Enter the elements of 1st matrix: ");
        for(int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < cols ; j++){
                matrix1[i][j] = in.nextInt();
            }
        }

        // Input Second matrix
        System.out.println("Enter the elements of 2nd matrix: ");
        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < cols ; j++) {
                matrix2[i][j] = in.nextInt();
            }
        }

        // Adding the matrix
        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < cols ; j++) {
                sum[i][j] = (matrix1[i][j] + matrix2[i][j]);
            }
        }
        // Display the result
        System.out.println("Sum of the matrix: ");
        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < cols ; j++ ) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
