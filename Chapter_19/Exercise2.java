import java.util.Scanner;
public class Exercise2
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        int n = 0;
        int sum = 55; 
        // int num;
        int end = 0;
        int x = 0;

        System.out.println("Enter N:");
        n = scan.nextInt();

        sum= (n*(n+1))/2;
        System.out.println( "Sum = " + sum);
        
        
        while ( sum <= end ){
            
            end = sum + 1;
            x = x + end;         
            System.out.println("Loop Sum: "  + sum);

        }
    }
}
