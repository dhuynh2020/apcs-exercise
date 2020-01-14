public class Shopping{
    public static void main(String[]args){
        Item [] data = new Item [10];         
        
        data[0] = new Item("Banana","020165465", 600 );
        data[1] = new Item("Jar", "1293", 100);
        data[2] = new Item("Item", "1235", 10);
        data[3] = new Item("Dog", "12351", 10000);
        data[4] = new Item("Noah Kivit", "1", -9000);
        data[5] = new Item("Potato", "123125214", 19999);
        data[6] = new Item("Hamburger", "12312524", 19999);
        data[7] = new Item("Taki", "12312521", 1699);
        data[8] = new Item("Cheeto", "12315214", 1299);
        data[9] = new Item("Pea", "13125214", 15999);
        
        
        Order order = new Order(data);
        Customer noah = new Customer("Thomas Jacobsen", "Simp2019@gmail.com", order);

        System.out.println(noah);
    }
}