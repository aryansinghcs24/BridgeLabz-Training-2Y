import java.util.ArrayList;
import java.util.List;

class Cart<T> {
    private final List<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public void removeItem(T item) { items.remove(item); }
    public void displayItems() { for (T i : items) System.out.println(i); }
}

class Electronics {
    private final String name;
    public Electronics(String name) { this.name = name; }
    public String toString() { return name; }
}

class Clothing {
    private final String name;
    public Clothing(String name) { this.name = name; }
    public String toString() { return name; }
}

public class CartDemo {
    public static void main(String[] args) {
        Cart<Electronics> eCart = new Cart<>();
        eCart.addItem(new Electronics("Laptop"));
        eCart.addItem(new Electronics("Phone"));
        eCart.displayItems();

        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing("Shirt"));
        cCart.addItem(new Clothing("Jeans"));
        cCart.displayItems();
    }
}
