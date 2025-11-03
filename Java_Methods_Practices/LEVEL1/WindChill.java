import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = input.nextDouble();
        if (temperature > 41 || temperature < -58 || windSpeed < 3) {
            System.out.println("The formula is not valid for the given inputs. Please try again with valid values.");
        } else {
            double windChill = calculateWindChill(temperature, windSpeed);

            System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
        }
    }
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}