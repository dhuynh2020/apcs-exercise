public class Order{
    
    private Item [] data;
    public Order(Item [] data){
        this.data = data; 

    }

    public double subtotal(){
        double sub = 0; 
        for( int i = 0; i < 10; i++){
            sub += data[i].getPrice();
        }
        sub = sub / 100.0;
        
        return sub;
    }

    public double salesTax(){
         double subtotal = subtotal() * .08; 
        int i = (int) (subtotal*100);
        return i/100.0;
    }

    public double grandTotal(){
        double total = salesTax() + subtotal();
        float i = (int) (total * 100);        
        return i / 100.00;
    }

    public String toString(){
        String str = "";
        for (int i = 0; i < 10; i++){
            str += data[i].getName() + "\t" + "\t" + data[i].getId() + "\t" + "\t" + data[i].getPrice() + "\n";
        }
        str += subtotal() + "\n" + salesTax() + "\n" + grandTotal();
        return str;
    }
    
    
        
}