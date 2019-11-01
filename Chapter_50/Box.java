public class Box{
    //variables
    private double width;
    private double height;
    private double length;
    private double side;
    //constructor
    public Box(double wid, double hei, double len){
        width = wid;
        height = hei;
        length = len;
    }
    // public Box(Box oldBox) {
    //     // return new Box(1.25*oldBox.width(), 1.25*oldBox.height(), 1.25*oldBox.length());
    // }

    //methods
    
    public double volume() {
        return width*height*length;       
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
        // return 2*((width*length)+(height*length)+(height*width));
    }
    public double width() {
        return width;
    }
    public double height() {
        return height;
    }
    public double length() {
        return length;
    }
    public double faceArea() {
        return width*length;
    }
    private double topArea() {
        return height*length;
    }
    private double sideArea() {
        return height*width;
    }
}
