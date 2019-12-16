import java.util.Scanner;
public class Exercise4
{
    public static void main(String[]args){
        int n = 0; 
        int x = 0;
        Scanner scan = new Scanner(System.in);
        double sum = 0.0;
        double term = 1; 

        System.out.println("Enter Sum:");
        x = scan.nextInt();
        while ( term > 1.0e-12) { 
            term = Math.pow(x, n) / factorial(n);
            sum += term;
            n++;
        }
        System.out.println("My: " + sum);
        System.out.println("Actual: " + Math.exp(x)); 
    }

    public static double factorial(double n) {
        int i = 1; 
        double factorial = 1;
        while( i <= n){
            factorial *= i;
            i++;
        }
        return factorial;
    }
}