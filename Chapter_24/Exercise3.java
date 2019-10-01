    import java.util.Scanner;
import java.util.Random;

public class Exercise3
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);

        int n;
        int sum = 0;

        System.out.println("Input N:");
        n = scan.nextInt();

        for ( int x = 1; x <= n; x = x + 2) {
            sum = sum + x;
            System.out.println("Sum: " + sum + "      N^2:" + n*n);  
        }
       System.out.println("Sum: " + sum + "      N^2:" + n*n);    

    }
}
