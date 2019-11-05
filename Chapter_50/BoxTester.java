public class BoxTester{
    public static void main(String[]args){

    Box box = new Box(2.5,5.0,6.0);
    // Box box2 = 
    Box box2 = box.biggerBox(box);
    Box box3 = box.smallerBox(box);
    System.out.println( "Area: "  + box.area() + " Volume: " + box.volume() );
    
    // System.out.println("top Area: " + box.topArea() );
    System.out.println( "Length: " + box.length() + " Height: " + box.height() +
                         " Width: " + box.width());

    System.out.println( "Length: " + box2.length() + " Height: " + box2.height() +
                         " Width: " + box2.width());

    System.out.println( "Length: " + box3.length() + " Height: " + box3.height() +
                         " Width: " + box3.width());
    System.out.println(box.nests(box3));
    System.out.println(box.nests(box2));
    System.out.println(box.nests(box));
    }
}