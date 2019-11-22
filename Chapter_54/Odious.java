import java.util.Scanner;

public class Odious{


  public static void main (String[] args) 
  {
    Scanner scan = new Scanner (System.in);

    System.out.println("Please enter a nonnegative number");
    int usrInput = scan.nextInt();
    
    int remainder = usrInput % 2; 
    int remainder2 = 0;
    int dividend = usrInput ;
    String newRep;
    String binaryRep = "";
    System.out.println();
    while ( dividend != 0) {
        remainder = dividend % 2;
        dividend = dividend / 2;
        remainder2 = remainder + remainder; 
        // System.out.println(remainder);
        // System.out.println(remainder2);
        // System.out.println();
        
        // System.out.println(dividend);
        newRep = binaryRep + remainder; 
        System.out.println(newRep); 

        // System.out.println( "Remainder          Dividend\n" + remainder + "          " + dividend);
    }
    
    while (Math.round(remainder2) >= 2){
      remainder2 = remainder2 / 2; 
    }
    // remainder2 = remainder2 - 1; 
    if (remainder2 == 1){
      System.out.println("The number you were given is an Odious Number");
    } else if(remainder2 == 0){ 
      System.out.println("The number you were given is an Evil Number");
    }
    


    // System.out.println
  }
}