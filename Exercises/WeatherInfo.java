public class WeatherInfo{
    private double temperture;
    private Geolocation geolocation; 

    public Weather(Geolocation geolocation, double temperture){
        this.geolocation = geolocation;
        this.temperture = temperture; 
    }

    public Geolocation getGeolocation(){
        return geolocation; 
    }

    public double getTemperture(){
        return temperture;
    }
}