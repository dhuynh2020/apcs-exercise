import java.util.Scanner;

public class ExerciseTwo
{
    public static void main (String[] args)
    {
        int inData;
        Scanner scan = new Scanner(System.in);
        int solved; 
        int solved2;

        System.out.println("Input the cents:");
        inData = scan.nextInt(); 
        solved = inData/ 100;
        solved2 = inData % 100; 

        System.out.println("You entered :");
        System.out.println(inData);
        System.out.println("That is " + solved + (" and ") + solved2);


    }
}