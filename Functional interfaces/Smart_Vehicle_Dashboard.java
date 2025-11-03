interface VehicleDashboard {
    void displaySpeed();

    default void displayBattery() {
    }
}

class Car implements VehicleDashboard {
    private int speed;
    public Car(int speed) {
        this.speed = speed;
    }

    public Car() {
    }
    @Override
    public void displaySpeed() {
        System.out.println("Car speed: " + speed + " km/h");
    }
}

class ElectricCar implements VehicleDashboard {
    @SuppressWarnings("FieldMayBeFinal")
    private int speed;
    @SuppressWarnings("FieldMayBeFinal")
    private int batteryPercent;
    public ElectricCar(int speed, int batteryPercent) {
        this.speed = speed;
        this.batteryPercent = batteryPercent;
    }
    @Override
    public void displaySpeed() {
        System.out.println("Electric Car speed: " + speed + " km/h");
    }
    @Override
    public void displayBattery() {
        System.out.println("Battery: " + batteryPercent + "%");
    }
}

public class Smart_Vehicle_Dashboard {
    public static void main(String[] args) {
        VehicleDashboard myCar = new Car(80);
        VehicleDashboard myElectricCar = new ElectricCar(70, 90);

        myCar.displaySpeed();          
        myCar.displayBattery();     

        myElectricCar.displaySpeed();  
        myElectricCar.displayBattery(); 
    }
}
