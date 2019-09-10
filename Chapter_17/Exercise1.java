import java.util.Scanner;
public class Exercise1
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in);
        String item = new String();
        double price = 0.0;
        double delivery = 0.0;
        double total = 0.0;
        
        System.out.println("Enter the item: ");
        item = scan.nextLine();

        System.out.println("Enter the Price: ");
        price = scan.nextDouble();

        System.out.println("Overnight delivery (0 == no, 1== yes");
        delivery = scan.nextDouble();

        

        if ( delivery == 1 && price < 10){
            total = price + 2;
        } else if( delivery == 0 && price >= 10){
            total = price;
        } else{
            total = price + 3;
        }

        System.out.println("The total for "+ item + " is " + total + " Dollars. " );
    }
}
