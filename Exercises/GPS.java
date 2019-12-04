public class GPS{
    public static void main(String[]args){
        Geolocation sample = new Geolocation("Wong Empire", 36.1, 139.2);

        System.out.println("Location: " + sample.getId() + " - " + sample.getLatitude() + "N " + sample.getLongitude()+ "E." );
    }
}