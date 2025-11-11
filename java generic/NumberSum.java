import java.util.Arrays;
import java.util.List;

public class NumberSum {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4);
        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.0);
        System.out.println(sumNumbers(ints));
        System.out.println(sumNumbers(doubles));
    }
}
