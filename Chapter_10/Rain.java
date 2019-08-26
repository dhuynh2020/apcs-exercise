public class Rain
{
    public static void main (String [] args)
    {
        final double April_Rainfall = 12;
        final double May_Rainfall = 14;
        final double June_Rainfall = 8; 
        final double all = April_Rainfall+May_Rainfall+June_Rainfall;
        final double value = all/3; 


        System.out.println("Rainfall for April " + April_Rainfall);
        System.out.println("Rainfall for May " + May_Rainfall);
        System.out.println("Rainfall for June " + June_Rainfall);
        System.out.println("Average Rainfall " + value);

        
    }

}