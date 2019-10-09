import java.util.*;

public class DiceGame{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random() ;
        int x; 
        int sum; 
        int playerOnePoints = 0;
        int computerScore = 0;

        
         


        System.out.println("You are playing the game Pigy. Each player starts at 0 points,\nwhoever gets to 100 Wins.");

        boolean endGame = false;
        
        while(!endGame){
            
            int sum1 = (int)(Math.random() * 6 + 1);
            int sum2 = (int)(Math.random() * 6 + 1);
            int sum3 = (int)(Math.random() * 6 + 1);
            int sum4 = (int)(Math.random() * 6 + 1);
            int sum5 = (int)(Math.random() * 6 + 1);
            int sum6 = (int)(Math.random() * 6 + 1);
             
        computerScore = computerScore + sum1 + sum2 + sum3;
          if (sum4 == 1 || sum5 == 1 || sum6 == 1){
            playerOnePoints = playerOnePoints;
  
        } else {
            playerOnePoints = playerOnePoints + sum4 + sum5 + sum6;

        }
        System.out.println("The Computer's Score is: " + computerScore);
        System.out.println("The Player's score is: " + playerOnePoints);
         if (playerOnePoints >=100 || computerScore >= 100){
            endGame = true;
        } 
        
         if (playerOnePoints >= 100){
            System.out.println("Player One Wins!!!");
        }else {
            System.out.println("Computer Wins!!!");
        }
        }
    }
}