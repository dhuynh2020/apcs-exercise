import java.util.Scanner;
public class ExerciseFour
{
    public static void main(String[]args)
    {
        float x;
        float y;
        double solved2;
        int solved;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter X:");
        x = scan.nextFloat();
        System.out.println("Enter Y:");
        y = scan.nextFloat();

        solved = Math.round( 2/  (1/x + 1/y));



        System.out.println("Arithmetic mean: "+ solved);
        
        solved2 = 2.0 / (1.0/x + 1.0/y);
        System.out.println("Harmonic mean: "+ solved2);

        
       
    }
}