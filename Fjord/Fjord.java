public class Fjord{
    
    public static void main(String[]args){
        Car car  = new Car("Takk", "Sedan", 40, 9.5);
        Car car2 = new Car("Beklager", "Sedan", 45, 7.5);
        Car car3 = new Car("Vakker", "SUV", 60, 7.5);
        Car car4 = new Car("Stygg", "SUV", 50, 9.0);
        Car car5 = new Car("Vanskellig", "Truck", 60, 8.75);
        Car car6 = new Car("Lastebil", "Truck", 70, 5.5);
        // mpg = Car.getMPG();    

        System.out.println("The Model "+ car.getCar() + " is a " + car.getType() +" with a tank size of " + car.getTank()  +".\nWhile Driving 60 MPH it drove for " + 
        car.getTime() +" hours. and " + car.governmentStandards());

        System.out.println(); 
        System.out.println("The Model "+ car2.getCar()+ " is a " + car2.getType()+" with a tank size of "  + car2.getTank()+".\nWhile Driving 60 MPH it drove for " + 
        car2.getTime()+" hours. and "  + car2.governmentStandards());

        System.out.println(); 
        System.out.println("The Model "+ car3.getCar()+ " is a " + car3.getType()+" with a tank size of "  + car3.getTank()+".\nWhile Driving 60 MPH it drove for " + 
        car3.getTime()+" hours. and "  + car3.governmentStandards());

        System.out.println(); 
        System.out.println("The Model "+ car4.getCar()+ " is a " + car4.getType()+" with a tank size of "  + car4.getTank()+".\nWhile Driving 60 MPH it drove for " + 
        car4.getTime()+" hours. and "  + car4.governmentStandards());

        System.out.println(); 
        System.out.println("The Model "+ car5.getCar()+ " is a " + car5.getType()+" with a tank size of "  + car5.getTank()+".\nWhile Driving 60 MPH it drove for " +
         car5.getTime()+" hours. and "  + car5.governmentStandards());

        System.out.println(); 
        System.out.println("The Model "+ car6.getCar()+ " is a " + car6.getType()+" with a tank size of "  + car6.getTank()+".\nWhile Driving 60 MPH it drove for " + 
        car6.getTime()+" hours. and "  + car6.governmentStandards());

         
    }
}