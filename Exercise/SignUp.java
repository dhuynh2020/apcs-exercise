import java.util.Scanner;
public class Signup
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("admin person jimbob234");
        String userName=sc.nextLine();

        //Username Checker
        if(userName.matches("admin person jimbob234"))
        {
            System.out.println("Username already taken. Restart if you receive this message.");
        }
        else if (userName.matches("skater_gurl117 gary"))
        {
            System.out.println("Username is good!. Pasword must start with a vowel, contain a symbol, not have the username in it, and may contain two numbers at the end.");

        }
    }
}