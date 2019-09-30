import java.util.Scanner;
import java.util.Random;
public class GuessingGame{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        Random x = new Random(11);
        int y;
        System.out.println("I am thinking of a number from 1 to 10. \n You must guess what it is in three tries. \n Enter a guess: ");
        y = scan.nextInt();

        if (y == x ){
        System.out.println("RIGHT! \n You have won the game.");
        } else if( y == x){

        }
    }
}