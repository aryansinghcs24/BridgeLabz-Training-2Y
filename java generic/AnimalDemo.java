import java.util.Arrays;
import java.util.List;

class Animal {
    private final String name;
    public Animal(String name) { this.name = name; }
    public String getName() { return name; }
}

class Dog extends Animal {
    public Dog(String name) { super(name); }
}

class Cat extends Animal {
    public Cat(String name) { super(name); }
}

public class AnimalDemo {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a.getName());
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog("Bruno"), new Dog("Rex"));
        List<Cat> cats = Arrays.asList(new Cat("Mia"), new Cat("Luna"));
        printAnimals(dogs);
        printAnimals(cats);
    }
}
