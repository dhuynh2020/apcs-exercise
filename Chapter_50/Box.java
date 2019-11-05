public class Box{
    //variables
    private double width;
    private double height;
    private double length;
    private double side;
    public boolean nests;
    //constructor
    public Box(double wid, double hei, double len){
       this.width = wid;
       this.height = hei;
       this.length = len;
    }

    public Box ( Box oldBox) {
        this.width = oldBox.width();
        this.height = oldBox.height();
        this.length = oldBox.length();

    }

    // methods
    
    public double volume() {
        return width*height*length;       
    }

    public Box biggerBox( Box oldBox ) 
    {
        return new Box(oldBox.width()*1.25,oldBox.height()*1.25,oldBox.length()*1.25);
    }

    public Box smallerBox( Box oldBox)
    {
        return new Box(oldBox.width()*0.75,oldBox.height()*0.75,oldBox.length()*0.75);    
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    public boolean nests ( Box outsideBox)
    {
        return outsideBox.length()>= length && outsideBox.height()>= height && outsideBox.width() >= width;
    }
    public double width() {
        return this.width;
    }
    public double height() {
        return this.height;
    }
    public double length() {
        return this.length;
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
