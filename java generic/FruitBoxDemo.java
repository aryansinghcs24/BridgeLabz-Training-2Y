import java.util.ArrayList;
import java.util.List;

class Fruit {
    private final String name;
    public Fruit(String name) { this.name = name; }
    public String getName() { return name; }
    public String toString() { return name; }
}

class Apple extends Fruit {
    public Apple() { super("Apple"); }
}

class Mango extends Fruit {
    public Mango() { super("Mango"); }
}

class FruitBox<T extends Fruit> {
    private final List<T> items = new ArrayList<>();
    public void add(T fruit) { items.add(fruit); }
    public void display() {
        for (T f : items) {
            System.out.println(f.getName());
        }
    }
}

class Car { }

public class FruitBoxDemo {
    public static void main(String[] args) {
        FruitBox<Fruit> mixed = new FruitBox<>();
        mixed.add(new Apple());
        mixed.add(new Mango());
        mixed.display();

        FruitBox<Apple> apples = new FruitBox<>();
        apples.add(new Apple());
        apples.display();
    }
}
