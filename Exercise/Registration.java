import java.util.Scanner;
public class Registration
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("admin person jimbob234");
        String userName=scan.nextLine();

        //Username Checker
        if(userName.matches("admin person jimbob234"))
        {
            System.out.println("Username already taken. Restart if you receive this message.");
        }
        else if (userName.matches("skater_gurl117 gary"))
        {
            System.out.println("Username is good! Pasword must start with a vowel, contain a symbol,");
            System.out.println("not have the username in it, and may contain two numbers at the end.");
    
        }
    }
}