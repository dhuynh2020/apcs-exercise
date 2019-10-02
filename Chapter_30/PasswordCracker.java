import java.util.Scanner;
import java.util.Random;

public class PasswordCracker
{
    public static void main(String[]args)
    {
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter a password under 5 characters");
    String userpass = scan.nextLine();

    Random rand = new Random();    
    
    String password = "";

    boolean correct = false;
    int tries = 0;

    while(!correct) {
        tries+= 1;
        String current = "";

        int i = 0;
            while (i <=5) { 
                i += 1;
                if(current.equals(userpass)) { 
                    correct = true;
                    password = current;
                }
                char x = (char)(rand.nextInt(26) + 'a');
                current = current + x;
            }
        }
        System.out.println("Your password is " + password + " and it took " + tries + " tries");
    }
}