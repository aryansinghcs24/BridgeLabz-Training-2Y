import java.util.Arrays;
import java.util.List;

abstract class Product {
    private final String name;
    private final double price;
    public Product(String name, double price) { this.name = name; this.price = price; }
    public double getPrice() { return price; }
    public String getName() { return name; }
    public String toString() { return name + ": " + price; }
}

class Mobile extends Product {
    public Mobile(String name, double price) { super(name, price); }
}

class Laptop extends Product {
    public Laptop(String name, double price) { super(name, price); }
}

public class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0.0;
        for (Product p : items) total += p.getPrice();
        return total;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(new Mobile("A", 10000), new Mobile("B", 15000));
        List<Laptop> laptops = Arrays.asList(new Laptop("X", 50000), new Laptop("Y", 65000));
        System.out.println(calculateTotal(mobiles));
        System.out.println(calculateTotal(laptops));
    }
}
