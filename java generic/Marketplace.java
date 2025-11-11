import java.util.ArrayList;
import java.util.List;

interface Category { }
interface BookCategory extends Category { }
interface ClothingCategory extends Category { }
interface GadgetCategory extends Category { }

class BaseProduct {
    private final String name;
    private double price;
    public BaseProduct(String name, double price) { this.name = name; this.price = price; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String toString() { return name + ": " + price; }
}

class ProductT<T extends Category> extends BaseProduct {
    public ProductT(String name, double price) { super(name, price); }
}

public class Marketplace {
    public static <T extends BaseProduct> void applyDiscount(T product, double percentage) {
        double discounted = product.getPrice() * (1 - percentage / 100.0);
        product.setPrice(discounted);
    }

    public static void main(String[] args) {
        ProductT<BookCategory> book = new ProductT<>("Novel", 500);
        ProductT<ClothingCategory> shirt = new ProductT<>("Shirt", 1000);
        ProductT<GadgetCategory> earbuds = new ProductT<>("Earbuds", 2000);
        List<BaseProduct> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(earbuds);
        for (BaseProduct p : catalog) System.out.println(p);
        applyDiscount(book, 10);
        applyDiscount(shirt, 20);
        for (BaseProduct p : catalog) System.out.println(p);
    }
}
