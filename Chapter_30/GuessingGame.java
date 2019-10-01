import java.util.Scanner;
import java.util.Random;
public class GuessingGame{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;
        int y;
        int tries = 3;
        System.out.println("I am thinking of a number from 1 to 10.\nYou must guess what it is in three tries.\nEnter a guess: ");
        y = scan.nextInt();
        
        while (tries != 1){
            tries = tries - 1;
            System.out.println("Incorrect Try Again you have " + tries + " Left");
            y = scan.nextInt();
        } if (y == x ){
        System.out.println("RIGHT! \n You have won the game.");
        } else {
            System.out.println("The correct answer was " + x + "\nYou have lost the game." );
        }
    }
}
