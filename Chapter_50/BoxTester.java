public class BoxTester{
    public static void main(String[]args){

    Box box1 = new Box(2.5,5.0,6.0);
    // Box box2 = 
    Box box2 = box1.biggerBox();
    System.out.println( "Area: "  + box1.area() + " Volume: " + box1.volume() );
    
    // System.out.println("top Area: " + box1.topArea() );
    System.out.println( "Length: " + box1.length() + " Height: " + box1.height() +
                         " Width: " + box1.width());
    System.out.println( "Length: " + box2.length() + " Height: " + box2.height() +
                         " Width: " + box2.width());
    }
}