
import java.util.Scanner;

public class ExerciseOne
{
    public static void main (String[] args)
    {
        double inData;
        double solved; 
        Scanner scan = new Scanner(System.in);
      

        System.out.println("Input the Radius:");
        inData = scan.nextDouble(); 
        solved = inData * inData * Math.PI ;

        System.out.println(" You entered: " + inData + " The Area is: " +(solved)); 

    }
}