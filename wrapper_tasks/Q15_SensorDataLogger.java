import java.util.ArrayList;
import java.util.List;

public class Q15_SensorDataLogger {
    private static final List<Double> storage = new ArrayList<>();
    public static void log(double temp) {
        storage.add(temp);
    }
    public static void log(Double temp) {
        if (temp != null) storage.add(temp);
    }
    public static void main(String[] args) {
        log(24.5);
        log(Double.valueOf(26.0));
        log(27.75);
        log(null);
        double sum = 0.0;
        for (Double v : storage) sum += v;
        System.out.println("Count: " + storage.size());
        System.out.println("Sum: " + sum);
    }
}
