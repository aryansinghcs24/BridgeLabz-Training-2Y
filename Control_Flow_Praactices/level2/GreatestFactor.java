import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            int greatestFactor = 1;
            if (number > 1) {
                for (int i = number - 1; i >= 1; i--) {
                    if (number % i == 0) {
                        greatestFactor = i;
                        break;
                    }
                }
                System.out.println(greatestFactor);
            } else {
                System.out.println("Enter an integer greater than 1.");
            }
        }
    }
}
