
import java.time.LocalDateTime;
import java.util.Scanner;
public class TimeExercise
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int hour;
        int minute;
        int second;

        int a;
        int b;
        int d;

        int hrleft;
        int mileft;
        int seleft;


        System.out.println("Enter Hour:");
        hour = scan.nextInt();
        System.out.println("Enter Minute");
        minute = scan.nextInt();
        System.out.println("Enter Second:");
        second = scan.nextInt();

        


        a = LocalDateTime.now().getHour();
        b = LocalDateTime.now().getMinute();
        d = LocalDateTime.now().getSecond();

        hrleft =  hour + a;
        if (hrleft > 12);
            hrleft = hour - 12;


        mileft = minute + b; 
        
        seleft = second +  d; 
        //if seleft()


       System.out.println("You have " + Math.abs(hrleft) + " hours left.");
       System.out.println("You have " + Math.abs(mileft) + " minutes left.");
       System.out.println("You have " + Math.abs(seleft) + " seconds left.");

 
        
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

       
    }
}
    
