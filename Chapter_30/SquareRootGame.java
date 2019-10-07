import java.util.*;

public class SquareRootGame
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random(100) ;

        String firstPlayer = "";
        String secondPlayer = "";
        double answer1;
        double answer2;
        int round = 0; 
        int firstPlayerWins = 0;
        int secondPlayerWins = 0;
        double firstPlayerDiff, secondPlayerDiff; 

        System.out.println("How many rounds?");
        round = scan.nextInt();

        System.out.println("First Player, Sign in --> ");
        scan.nextLine();
        firstPlayer = scan.nextLine();
        System.out.println("Second Player, Sign in --> ");
        secondPlayer = scan.nextLine();

        boolean game = false;

        while(!game ){
            double x = Math.random() * 99;
            System.out.println("What is the square root of " + x + " ?" );
            answer1 = scan.nextDouble();
            System.out.println(firstPlayer + " You guessed " + answer1);
            answer2 = scan.nextDouble();
            System.out.println(secondPlayer + " You guesssed " + answer2);      
            firstPlayerDiff = Math.abs(x - answer1);
            secondPlayerDiff = Math.abs(x - answer2); 

         if ( firstPlayerDiff < answer1){
            System.out.println( firstPlayer + " wins!");
            round -= 1;
            firstPlayerWins+=1; 
        } else { 
            System.out.println(secondPlayer + " wins!");
            round -= 1;
            secondPlayerWins+= 1;
        }
        if( round == 0) { 
            game = true;
        }
        if (firstPlayerWins > secondPlayerWins){
            System.out.println(firstPlayer + " wins the game with " + firstPlayerWins + " points");
        } else if ( firstPlayerWins < secondPlayerWins) { 
            System.out.println( secondPlayer + " wins the game with " + secondPlayerWins + " points");

        }
        }
    }
}