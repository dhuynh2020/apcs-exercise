public class Car{
    //data 
    private String car;
    private String type;

    private double mpg; 
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
    public double getMPG(){
        return (60 * time) / (tank*.264712);  
    }

    public Boolean governmentStandards(){
        if(this.type == "Sedan" && mpg >= 50){
            return true;   
        } else if (this.type == "SUV" &&  mpg >= 40) {
            return true;
        } else if ( this.type == "Truck" && mpg >= 30){
            return true;
        } else { 
            return false;
        }
    }
       

}