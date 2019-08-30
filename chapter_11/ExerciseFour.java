public class ExerciseFour
{
    public static void main (String[]args)
    {
        int len;
        
        String str = new String ( "Golf is a good walk spoiled." ); 
        String sub = str.substring(0,28);
        len = str.length();
        System.out.println(len);
        System.out.println(sub);
    }
}