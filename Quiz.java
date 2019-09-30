import java.util.Scanner;
public class Quiz
{
    public static void main(String[]args)
    {
        String str = new String ();
        Scanner scan = new Scanner(System.in);
        String read;
        System.out.print("Input DNA squence one at a time");
        read = scan.nextLine();
        System.out.print("Enter Q to end the code");
        
        while (read.matches("acgt")){ 
        read = scan.nextLine();
        } if (read.matches("q")){
            System.out.println("Done");
        }
        
            
        

    }
}