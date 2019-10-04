import java.util.Scanner;
import java.util.Random;
public class RandomWalk
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        double distance;
        double steps;
        System.out.println("How many steps do you wish to take?");
        steps= scan.nextInt();

        double i = 0; 
        double x = 0;   
        double y = 0;
        while (i < steps){
            i ++;
            x = x * x + (rand.nextDouble() * 2 ) -1;
            y = y * y + (rand.nextDouble() * 2 ) - 1; 
        } 
        distance = Math.sqrt(Math.pow(x,2) * Math.pow(y,2));

        System.out.println("You chose " + steps + " and the distance was " + distance );




    }
}