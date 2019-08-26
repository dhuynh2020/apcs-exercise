public class Example 
{
    public static void main ( String[] args)
    {
        int x = 2; 
        long hoursWorked = x;
        double payRate =10, taxRate = .634;
        System.out.println("Hours Worked:" + hoursWorked );
        System.out.println("pay Amount: " + (hoursWorked * payRate) );
        System.out.println("tax Amount: " + (hoursWorked * payRate * taxRate) );

    }

}
