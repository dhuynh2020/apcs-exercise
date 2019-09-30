import java.util.Scanner;
public class Quiz2
{
    public static void main(String[]args)
    {
        Scanner Scan = new Scanner (System.in);
        int start = 0;
        int end = 1 ;
        String dna = new String ("AGGATA"); 
        System.out.println(dna);

        while (start <= dna.length())
        {
            start = start + 1;
            end = end + 1;
        }
        while (dna.matches("A")){
            System.out.println("T");
        } if (dna.matches("T")){
            System.out.println("A");
        } else if (dna.matches("C")){
            System.out.println("G");
        } else if (dna.matches("G")){
            System.out.println("C");
        }
        System.out.println(dna);
    }
}