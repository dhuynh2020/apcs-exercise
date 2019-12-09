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
        double c = getC(other.getA()); 
        double a = getA();
        double latitudeChange;
        c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt((1-a)));
        distance = radius * c;
        latitudeChange = Math.pow(Math.Sin(Math.abs(this.latitude - other.getLatitude() ),2) + Math.cos(this.longitude) * Math.cos(other.getLongitude())
                        * Math.pow(Math.sin(Math.abs(this.longitude - other.longitude())), 2) );
        return latitudeChange; 
    } 


  
    // public double differenceLatitude(){
    //     // private double difference = getDistance();


    // }
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