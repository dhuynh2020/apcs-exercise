import java.util.Scanner;

public class ExerciseOne
{
    public static void main(String[]args)
    {
        double inData; 
        double inData2; 
        double solved;
        Scanner scan = new Scanner( System.in); 

        System.out.println("Input cents");
        inData = scan.nextDouble();
        inData = inData / 100; 
        System.out.println("Enter Kilowatt-hours used per year");
        inData2 = scan.nextDouble();


        System.out.println("Annual cost " + (inData*inData2));
    
    }
}