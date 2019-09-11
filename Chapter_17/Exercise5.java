import java.util.Scanner;
public class Exercise5
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int lbs;
        int total;

        System.out.println("How much Pounds of Trash: ");
        lbs = scan.nextInt();

        if ( lbs <= 299 && lbs >= 200  ){
            total = 20 ;
            System.out.println("The cost is $" + total);

        }else if( lbs >= 300){
            lbs = lbs - 200 ;
            total = Math.round(lbs / 100) * 8 + 20;
            Math.round(total);
            System.out.println("The cost is $" + total);


        }

    }
}