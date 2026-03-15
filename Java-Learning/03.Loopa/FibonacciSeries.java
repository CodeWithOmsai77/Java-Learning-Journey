import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;

//      it is the formula of fibonacci series
//        next = previous + current
//        previous = current
//        current = next

//        while (count <= num) {
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count ++ ;
//        }
//        System.out.println(b);



//        this is a short way to solve the fibonacci problem
        int a = 0, b = 1;

        for(int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}




