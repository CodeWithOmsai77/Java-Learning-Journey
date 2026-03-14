import java.util.Scanner;
// count nums

public class ConditionalLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the numbers: "); // this is the list of number
        int n = in.nextInt();
//        System.out.println("Enter the number you want to count: "); // this is used to find the
                                                        // specific number from the above list
//        int f = in.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n %10;

            if (rem == 5) {
                count ++ ;
             }
            n = n / 10;
        }
        System.out.println(count);
    }
}
