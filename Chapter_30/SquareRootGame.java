import java.util.*;

public class SquareRootGame
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random(100);

        String FirstPlayer = "";
        String SecondPlayer = "";
        double answer1, answer2 = 0;
        int round, FirstPlayerWins, SecondPlayerWins = 0;
        double FirstPlayerDiff, SecondPlayerDiff; 
        System.out.println("How many rounds?");
        round = scan.nextInt();
        System.out.println("First Player, Sign in --> ");
        FirstPlayer = scan.nextLine();
        System.out.println("Second Player, Sign in --> ");
        SecondPlayer = scan.nextLine();

        boolean game = false;
        while(!game ){
            double x = Math.random();
            System.out.println("What is the square root of " + x + " ?" );
            answer1 = scan.nextDouble();
            System.out.println(FirstPlayer + " You guessed " + answer1);
            answer2 = scan.nextDouble();
            System.out.println(SecondPlayer + " You guesssed " + answer2);      
            FirstPlayerDiff = Math.abs(x - answer1);
            SecondPlayerDiff = Math.abs(x - answer2); 

        } if ( FirstPlayerDiff < SecondPlayerDiff){
            System.out.println( FirstPlayer + " wins!");
            round -= 1;
            FirstPlayerWins = FirstPlayerWins + 1; 
        } else if( FirstPlayerDiff > SecondPlayerDiff) { 
            System.out.println(SecondPlayer + " wins!");
            round -= 1;
            SecondPlayerWins = SecondPlayerWins + 1;
        } else if( round == 0) { 
            game = true;
        }
        

    }
}