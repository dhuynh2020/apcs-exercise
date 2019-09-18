import java.util.Scanner;
public class Exercise1
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int value = 0;
        int end;

        System.out.println("Enter Start");
        value = scan.nextInt();
        
        System.out.println("Enter End");
        end = scan.nextInt();
        
        while(value<= end){
            System.out.println( value);
            value = value + 1;
        }
        

    }
}