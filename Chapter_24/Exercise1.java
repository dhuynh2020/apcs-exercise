import java.util.Scanner;
import java.util.Random;

public class Exercise1
{
    public static void main(String[]args)
    {
        // Scanner scan = new Scanner (System.in);
        double n = 1;
        double t = 1;

        double power = Math.pow(0.83, t);
        n = 220/(1+10*power);

        for (n = 80; n >= 80;  n++) {
            System.out.println("Number : " + n + "  Years: " + t);
        }

        System.out.println("Count is now" + n);
    }
}
