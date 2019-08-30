import java.util.scanner; 


public class ExerciseThree
{
    public static void  main (String[] args)
    {
        double inData;
        Scanner scan = new Scanner ( System.in);
        double solved;
        int solved2;

        System.out.println("Input Cents");
        inData = scan.nextInt();
        solved = indata / 100;
        solved2 = indata % 100;

        System.out.println("That is " + solved + (" and ") + solved2);
        System.out.println("you get " + ");
        

    }
}