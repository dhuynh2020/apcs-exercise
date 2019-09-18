import java.util.Scanner;

public class Exercise2
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        double n;
        double m = 1;
        double sum = 0;

        System.out.println("Enter n: ");
        n = scan.nextDouble();

        while (m <= n) {
            sum = 1/m + sum;
            m = m + 1;
        }

        System.out.println("The sum is " + sum);
    }
}