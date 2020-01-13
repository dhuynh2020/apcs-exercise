public class Order{
    
    private Item [] data;
    public Order(Item [] data){
        this.data = data; 

    }

    public int subtotal(){
        int sub = 0; 
        for( int i = 0; i < 10; i++){
            sub += data[i].getPrice();
        }
        return sub;
    }

    public double salesTax(){
        return subtotal() * 0.08;
    }

    public double grandTotal(){
        return subtotal() + salesTax();
    }
    
    
        
}