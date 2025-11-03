
interface RentalVehicle {
    void rent();
    void returnVehicle();
}

class Car implements RentalVehicle {
    @Override
    public void rent() { System.out.println("Car has been rented."); }
    @Override
    public void returnVehicle() { System.out.println("Car has been returned."); }
}

class Bike implements RentalVehicle {
    @Override
    public void rent() { System.out.println("Bike has been rented."); }
    @Override
    public void returnVehicle() { System.out.println("Bike has been returned."); }
}

class Bus implements RentalVehicle {
    @Override
    public void rent() { System.out.println("Bus has been rented."); }
    @Override
    public void returnVehicle() { System.out.println("Bus has been returned."); }
}

public class Multi_Vehicle_Rental_System {
    public static void main(String[] args) {
        RentalVehicle car = new Car();
        RentalVehicle bike = new Bike();
        RentalVehicle bus = new Bus();

        car.rent();           
        bike.rent();        
        bus.rent();           

        car.returnVehicle();   
        bike.returnVehicle();  
        bus.returnVehicle();  
    }
}
