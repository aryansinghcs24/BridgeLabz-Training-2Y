import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private final String name;
    public Vehicle(String name) { this.name = name; }
    public String toString() { return name; }
}

class Truck extends Vehicle {
    public Truck(String name) { super(name); }
}

class Bike extends Vehicle {
    public Bike(String name) { super(name); }
}

class FleetManager<T extends Vehicle> {
    private final List<T> fleet = new ArrayList<>();
    public void addVehicle(T vehicle) { fleet.add(vehicle); }
    public void showFleet() { for (T v : fleet) System.out.println(v); }
}

public class FleetManagerDemo {
    public static void main(String[] args) {
        FleetManager<Truck> trucks = new FleetManager<>();
        trucks.addVehicle(new Truck("Hauler"));
        trucks.addVehicle(new Truck("Mover"));
        trucks.showFleet();

        FleetManager<Bike> bikes = new FleetManager<>();
        bikes.addVehicle(new Bike("Roadster"));
        bikes.addVehicle(new Bike("Commuter"));
        bikes.showFleet();
    }
}
