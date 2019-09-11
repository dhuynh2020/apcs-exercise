import java.util.Scanner;
public class Registration
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Username: ");
        String userName=scan.nextLine();
        //Username Checker
        if(userName.matches("jimbob234"))
        {
            System.out.println("Username already taken. Restart if you receive this message.");
        }
        else
        {
            System.out.println("Username is good! Pasword must start with a vowel, contain a symbol,");
            System.out.println("not have the username in it, and may contain two numbers at the end.");
           
            System.out.println("Enter Password:");
            
            
           
        }
         //Password Checker
        //  System.out.println("Enter Password:");
        //  String Password=scan.nextLine();
        // //  if(Password=matches("x>admin person jimbob");
        //  {
        //      System.out.println("");
        //  }

        {
            System.out.println("Good Bye");
        }





    }
}