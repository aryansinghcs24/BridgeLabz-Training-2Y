import java.util.ArrayList;
import java.util.Collections;

public class Q07_PricesStats {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> list = new ArrayList<>();
        double sum = 0.0;
        for (double v : prices) {
            list.add(v);
            sum += v;
        }
        double max = Collections.max(list);
        double avg = sum / list.size();
        System.out.println("Highest: " + max);
        System.out.println("Average: " + avg);
    }
}
