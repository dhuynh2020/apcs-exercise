public class Car{
    //data 
    private String car;
    private String type;
    public static final double LITERS_TO_GALLONS = .264172;
    public static final double TEST_SPEED = 60;
    private double mpg; 
    private double fuel;
    private int tank;
    private double time;

    // constructor
    public Car(String car, String type, int tank, double time){
        this.car = car;
        this.type = type; 
        this.tank = tank;
        this.time = time;
    }

    // functions - abilities

    // getters and setters

    public String getCar(){
        return this.car;
    }
    
    public String getType(){
        return this.type;
    }

    public int getTank(){
        return this.tank;
    }

    public double getTime(){
        return this.time;
    }
    public double fuel(){
        return (TEST_SPEED * this.time) / (this.tank* LITERS_TO_GALLONS);  
    }

    public Boolean governmentStandards(){
        if(this.type == "Sedan" && fuel >= 50){
            return true;    
        } else if (this.type == "SUV" &&  fuel >= 40) {
            return true; 
        } else if ( this.type == "Truck" && fuel >= 30){
            return true; 
        } else { 
            return false;
        }
    }
       

}