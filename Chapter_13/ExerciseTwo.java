import java.util.Scanner;

public class ExerciseTwo
{
    public static void main(String[]args)
    {
        double inData ;

        Scanner scan = new Scanner( System.in);
        double solved; 

        System.out.println("Input time:");
        inData = scan.nextDouble();
         solved = (.5*32.174) * (inData * inData);
        System.out.println("You get " + solved);
        
 
    }
}