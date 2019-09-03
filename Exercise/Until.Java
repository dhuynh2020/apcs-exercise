
import java.util.LocalDateTime;
import java.util.Scanner;
public class Until
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int hours;
        int minutes;
        int seconds; 

        System.out.println("Enture future time (hh:mm:ss)");
        hours = scan.nextInt();
        minutes = scan.nextInt();
        seconds = scan.nextInt();

       // LocalDate time = LocalDate.now();
        

        LocalDateTime.now().getHour();
        LocalDateTime.now().getMinute();
        LocalDateTime.now().getSecond();
    }
}
    
