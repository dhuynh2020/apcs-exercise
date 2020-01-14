public class Customer{
    private String name;
    private String email;
    private Order order;

    public Customer(String name, String email, Order order){
        this.name = name;
        this.email = email;
        this.order = order ;
    }

    public String toString(){
        return name + "\t" + email + "\n" + order.toString();
    }
}   