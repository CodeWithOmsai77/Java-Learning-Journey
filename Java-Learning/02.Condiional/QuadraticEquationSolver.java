//practical2-quadratic equation//


import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String args[])
    {
        double a, b, c, d, root1, root2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        c = sc.nextDouble();

        d = b * b - 4 * a * c;   // Discriminant

        if (d > 0)
        {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and distinct");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        }
        else if (d == 0)
        {
            root1 = -b / (2 * a);
            System.out.println("Roots are real and equal");
            System.out.println("Root = " + root1);
        }
        else
        {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are complex");
            System.out.println("Root 1 = " + real + " + " + imag + "i");
            System.out.println("Root 2 = " + real + " - " + imag + "i");
        }
    }

}
