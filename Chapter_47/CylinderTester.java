import java.util.Scanner;
public class CylinderTester
{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double radius, height;

        System.out.println("Enter Radius:");
        radius = scan.nextDouble();
        System.out.println("Enter Height:");
        height = scan.nextDouble();

        Cylinder cylinder = new Cylinder(radius, height);

        System.out.println("Volume: " + cylinder.volume() + "\nSurface Area: " + cylinder.sA());
    }
}