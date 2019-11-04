public class Box{
    //variables
    private double width;
    private double height;
    private double length;
    private double side;
    //constructor
    public Box(double wid, double hei, double len){
       this.width = wid;
       this.height = hei;
       this.length = len;
    }

    public Box ( Box oldBox) {
        this.width = oldBox.width()*1.25;
        this.height = oldBox.height()*1.25;
        this.length = oldBox.length()*1.25;
    }

    // methods
    
    public double volume() {
        return width*height*length;       
    }

    public Box biggerBox( Box oldBox ) 
    {
        return new Box(oldBox.width(),oldBox.height(),oldBox.length());
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
    public double topArea() {
        return height*length;
    }
    public double sideArea() {
        return height*width;
    }
}
