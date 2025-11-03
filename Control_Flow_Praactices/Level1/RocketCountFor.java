import java.util.Scanner;

public class RocketCountFor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter countdown start number: ");
            int counter = scanner.nextInt();
            
            for (int i = counter; i >= 1; i--) {
                System.out.println(i);
            }
            System.out.println("Rocket Launched!");
        }
    }
}
