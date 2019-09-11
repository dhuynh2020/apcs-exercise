import java.util.Scanner;
public class Exercise4
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in);
        String name;
        int strength;
        int health;
        int luck;
        // int name;
        int total = 15;
        int skillpoint;
        

        System.out.println("Welcome to Yertle's Quest");
        System.out.println("Enter the name of your character");
        name = scan.nextLine();


        System.out.println("Enter strenght (1 - 10): ");
        strength = scan.nextInt();

        System.out.println("Enter health (1-10)");
        health = scan.nextInt();

        System.out.println("Enter luck (1-10");
        luck = scan.nextInt();
        System.out.println("Character: " + name );

      
        if ( 15  >= (strength + health + luck)){
            // bool test = (skillpoint ==0)? false : true;
           skillpoint = strength + health + luck;
      
           System.out.println("Strength: "+ strength);
            System.out.println("Health: "+ health);
            System.out.println("Luck: " + luck);
        } else{
            System.out.println("You have give your characters too many/little points!");
            System.out.println("Default values have been assigned:");
            // System.out.println("Name: "+ name);
            System.out.println("Strength: 5");
            System.out.println("Health: 5");
            System.out.println("Luck: 5");
        }

    }
}