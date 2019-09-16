import java.util.Scanner;

public class Exercise3
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        String word;
        String word2;
        int space = 0;
        String period = System.out.println(".");
        System.out.println("Enter first word");
        word = scan.nextLine();
        System.out.println("Enter second word");
        word2 = scan.nextLine();
        space = space + 1;
        while(space <= 30){
            System.out.println(period);
            space = space + 1; 
            
        } 
        System.out.println(word + word2);

    }
}