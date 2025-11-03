import java.util.function.Predicate;

public class Temperature_Alert_System {
    public static void main(String[] args) {
        double threshold = 37.5;

        Predicate<Double> tempAlert = temp -> temp > threshold;

        double[] readings = {36.0, 37.0, 37.6, 38.2, 36.7};

        for (double temp : readings) {
            if (tempAlert.test(temp)) {
                System.out.println("ALERT: Temperature " + temp + " crosses threshold!");
            } else {
                System.out.println("Temperature " + temp + " is normal.");
            }
        }
    }
}
