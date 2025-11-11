import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class WarehouseItem {
    private final String name;
    public WarehouseItem(String name) { this.name = name; }
    public String toString() { return name; }
}

class ElectronicsItem extends WarehouseItem {
    public ElectronicsItem(String name) { super(name); }
}

class GroceryItem extends WarehouseItem {
    public GroceryItem(String name) { super(name); }
}

class FurnitureItem extends WarehouseItem {
    public FurnitureItem(String name) { super(name); }
}

class Storage<T extends WarehouseItem> {
    private final List<T> items = new ArrayList<>();
    public void add(T item) { items.add(item); }
    public List<T> getItems() { return items; }
}

public class WarehouseSystem {
    public static void displayAll(List<? extends WarehouseItem> list) {
        for (WarehouseItem i : list) System.out.println(i);
    }

    public static void main(String[] args) {
        Storage<ElectronicsItem> e = new Storage<>();
        e.add(new ElectronicsItem("TV"));
        e.add(new ElectronicsItem("Phone"));
        displayAll(e.getItems());
        Storage<GroceryItem> g = new Storage<>();
        g.add(new GroceryItem("Rice"));
        g.add(new GroceryItem("Milk"));
        displayAll(g.getItems());
    }
}
