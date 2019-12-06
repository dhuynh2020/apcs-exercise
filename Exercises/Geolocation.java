import java.util.Scanner;  

    public class Geolocation { 
        private double latitude; 
        private double longitude;
        private final double radius = 6371; 
        private String id; 
    

    public Geolocation(String id, double latitude, double longitude){
        this.id =id;
        this.latitude = latitude;
        this.longitude =longitude; 

    }
    public Geolocation(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude =longitude; 

    }


    // getters and setters
    public double getDistance(Geolocation other){ 
        private double c = getC(other); 
        distance = radius * c;
        return distance; 
    } 

    private double getC(){
        private double a = getA(other); 
        c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt((1-a)));
        return c;
    }

    private double getA(){
        private double a; 
        a = Math.pow(Math.sin(),2)
    }

    public double differenceLatitude(){
        // private double difference = getDistance();


    }
    public String getId(){
        return this.id;
    }

    public double getLatitude(){
        return this.latitude;
    }
    
    public double getLongitude(){
        return this.longitude;
    }
}