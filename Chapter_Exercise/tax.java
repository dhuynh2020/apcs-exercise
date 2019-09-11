import java.util.Scanner;
public class tax
{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in);
        double income, total = 0.0;
        // int rate;
        int paid, tax;
        // double total = 0.0;
        // int tax;

        System.out.println("Enter income per year");
        income = scan.nextDouble();

        if(income < 15000){
            tax = 0;
        } else if(income >= 15000 && income <35000){
            total = (income - 15000) * .1 +2000;
        }else if ( income >= 35000 && income < 65000){
            total = (income - 35000) *.16 + 6800;
        } else if ( income >= 65000 && income < 105000){
            total = (income - 65000) * .19 + 6800+7600;
        } else if ( income > 105000){
            total = (income - 105000) * 0.22 + 6800+7600;
        }

        System.out.println("Total paid: " + total);
        System.out.println(Math.round(total/income * 100) + ("% of ") + income);
    }
}