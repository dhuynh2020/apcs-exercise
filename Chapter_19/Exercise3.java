import java.util.Scanner;

public class Exercise3
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        String word;
        String word2;
        String space = new String();
        String period;
        int n;

        
        System.out.println("Enter first word");
        word = scan.nextLine();
        System.out.println("Enter second word");
        word2 = scan.nextLine();
        n = word.length() + word2.length();


        System.out.println(word);

        while(word.length() + word2.length() + space.length() < 30){
            System.out.println(".");
            space = space + 1;
            
        } 
        System.out.println(word2);

        // System.out.println(word + space + word2);

    }
}   