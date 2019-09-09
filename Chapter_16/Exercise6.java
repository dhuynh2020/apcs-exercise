import java.util.Scanner;
public class Exercise6
{
    private static final String e = null;

	public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in); 
        int temp = 50;
        int speed = 3;
        double total;
    
        System.out.println("Input Temperature");
        temp = scan.nextInt();
        System.out.println("Input mph");
        speed = scan.nextInt();
        


        if ( 3 <= speed &&  temp >= 50 ){
            total = 35.74 + (.6215*temp)- 35.75 * ( Math.pow(speed, .16)) + temp*.4275*(Math.pow(speed,.16));
        }
    }
}