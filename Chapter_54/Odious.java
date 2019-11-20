import java.util.Scanner;

public class Odious{


  public static void main (String[] args) 
  {
    Scanner scan = new Scanner (System.in);

    System.out.println("Please enter a nonnegative number");
    int usrInput = scan.nextInt();
    
    int remainder = usrInput % 2; 
    int dividend = usrInput / 2;
    String newRep;
    String binaryRep = "";
    while ( dividend != 0) {
        remainder = dividend % 2;
        dividend = dividend / 2;
        newRep = binaryRep + remainder; 
        System.out.println(newRep); 
        // System.out.println( "Remainder          Dividend\n" + remainder + "          " + dividend);
    }

    


    // System.out.println
  }
}