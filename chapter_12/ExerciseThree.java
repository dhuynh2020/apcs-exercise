import java.util.scanner; 


public class ExerciseThree
{
    public static void  main (String[] args)
    {
        double inData;
        Scanner scan = new Scanner ( System.in);
        int dollars;
        int qarters;
        int dimes;
        int nickels;
        int pennies;


        System.out.println("Input Cents");
        dollars = inData /100;
        quaters = (inData % 100) /25;
        dimes = ((inData % 100) % 25) / 10;
        nickels = (((inData % 100) % 25) % 10) /5;
        pennies = ((((inData % 100) % 25) % 10) % 5) / 1;       
        System.out.println("You gave" + inData + " in change which would give you " + dollars + " dollars, " + quaters + " quaters, " + dimes + "  dimes, " + nickels + " nickels, and " + pennies + " cents."

    }
}