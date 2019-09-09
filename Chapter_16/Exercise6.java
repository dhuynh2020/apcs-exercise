import java.util.Scanner;
public class Exercise6{
	public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in); 
        int temp;
        int speed;
        double windchill;
    
        System.out.println("Input Temperature");
        temp = scan.nextInt();
        System.out.println("Input mph");
        speed = scan.nextInt();
        
        if ( speed < 3 || temp > 50)
        {
           windchill = temp;
        } else{
            windchill = 35.74 + (.6215*temp)- 35.75 * ( Math.pow(speed, .16)) + temp*.4275*(Math.pow(speed,.16));
            
        }
        System.out.println("Wind Chill: " +windchill);
    }
}