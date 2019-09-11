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

            
           
        }
         //Password Checker
       

         System.out.print("Enter a password. Password must start with a vowel, include a symbol, not contain the username, and can only have two numbers at the end.");
         String pass=scan.nextLine();
     
         String lPass=pass.toLowerCase();
         char first=lPass.charAt(0);
     
     if(lPass.matches("^[aeiouy]\\D*?[#!$&]\\D*?\\d{0,2}$") && !lPass.contains(userName.toLowerCase())){
         System.out.println("It's good!");
     } else {
         System.out.println("No good!");
     }

        {
            System.out.println("Good Bye");
        }





    }
}