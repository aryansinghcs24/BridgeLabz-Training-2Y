import java.util.Scanner;

public class Q01_PrimitiveToWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer obj = Integer.valueOf(n);
        System.out.println("Primitive: " + n);
        System.out.println("Object: " + obj);
        sc.close();
    }
}
