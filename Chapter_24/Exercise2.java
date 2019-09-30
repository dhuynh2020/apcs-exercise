import java.util.Scanner;

public class Exercise2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);

        int n, sum = 0;
        System.out.println("Input N: ");
        n = scan.nextInt();

        for (int x = 1; x < n; x ++){
                sum = sum + x; 

                System.out.println("Sum: " + sum +  "\nN^2: " + n*n);
                    
        }

        System.out.println("Sum: " + sum +  "\nN^2: " + n*n);
        

    }
}