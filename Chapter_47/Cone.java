public class Cone {
    // instance variables 
    private double radius;
    private double height;
    
    // constructor
    public cone(double rad, double hei)
    {
        radius = rad;
        height = hei;
    }
    //methods

    public double volume(){
        return Math.PI*radius*(radius + Math.sqrt(height*height + radius*radius) );
    }

    public double area(){
        return Math.PI*radius*radius*height/3.0;
    }
}