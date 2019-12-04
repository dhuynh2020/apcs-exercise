import java.util.Scanner;  

    public class Geolocation { 
        private double latitude; 
        private double longitude;
        private final double radius = 6371; 
        private String id; 
        private double distance;
        private double c; 
        private double a; 
        // private 
    

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
    public double getDistance(){ 
        distance = radius * c; 
    } 

    public double getC(){
        c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt((1-a)));
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