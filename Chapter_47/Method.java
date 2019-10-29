import java.util.Scanner;
public class Method{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double radius, height;

        System.out.println("Enter Radius:");
        radius = scan.nextDouble();

        System.out.println("Enter Height:");
        height = scan.nextDouble();

        Cone cone = new Cone (radius, height);

        System.out.println("Area " + cone.area() + " Volume: " + cone.volume() );  

    }

}