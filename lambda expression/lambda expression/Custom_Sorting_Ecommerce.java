import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    int discount;

    Product(String name, double price, double rating, int discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount + "%";
    }
}

public class Custom_Sorting_Ecommerce {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Phone", 9999, 4.5, 10),
            new Product("Tablet", 14999, 4.2, 15),
            new Product("Laptop", 39999, 4.8, 20),
            new Product("Headphones", 1999, 4.0, 25)
        );

        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("-- Sorted by Price --");
        products.forEach(System.out::println);

        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("-- Sorted by Rating --");
        products.forEach(System.out::println);

        products.sort((p1, p2) -> Integer.compare(p2.discount, p1.discount));
        System.out.println("-- Sorted by Discount --");
        products.forEach(System.out::println);
    }
}
