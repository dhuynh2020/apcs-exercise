public class Cylinder{
    public double radius;
    public double height;

    public Cylinder(double rad, double hei){
        this.radius = rad;
        this.height = hei;
    }
    public double volume(){
        return Math.PI*(radius*radius) * height; 
    }

    public double sA(){
        return 2*(Math.PI)*(radius*radius)+2*(Math.PI)*(radius * radius)*height;
    } 


}