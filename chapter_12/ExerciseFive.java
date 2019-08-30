import java.util.Scanner;

import javafx.scene.shape.Line;

public class ExerciseFive
{
    public static void main (String[] args)
    {

        Scanner scan = new Scanner(System.in);
        long words; 
        long x;
        long y;
        long w;
        int len;
        String str = new String("Enter a String:" );
        
        len = str.length();
        
        System.out.println("Beginning Index: ");
        x = scan.nextLong();

        System.out.println("Ending Index: ");
        y = scan.nextLong();

        String sub = str.subString(x,y);


    
        
        
        System.out.println(sub);

    }
}