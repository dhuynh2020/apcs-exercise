import java.util.Scanner;



public class ExerciseFive
{
    public static void main (String[] args)
    {

        Scanner scan = new Scanner(System.in);
        long words; 
        int x;
        int y;
        String w;
        String str = new String("Enter a String:" );
        System.out.println(str);
        w = scan.nextLine();
        
        
        System.out.println("Beginning Index: ");
        x = scan.nextInt();

        System.out.println("Ending Index: ");
        y = scan.nextInt();

        String sub = w.substring(x,y);


    
        
        System.out.println(w);
        System.out.println(sub);
        

    }
}