import java.util.Scanner;

public class RocketCountdown {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter countdown start number: ");
            int counter = scanner.nextInt();

            while (counter >= 1) {
                System.out.println(counter);
                counter--;
            }
        }
        System.out.println("Rocket Launched!");
    }
}
