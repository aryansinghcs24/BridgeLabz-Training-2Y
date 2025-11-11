import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Q16_ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] primitiveRatings = {5, 4, 3, 5, 2};
        ArrayList<Integer> objectRatings = new ArrayList<>();
        objectRatings.add(4);
        objectRatings.add(null);
        objectRatings.add(5);
        objectRatings.add(3);
        List<Integer> combined = new ArrayList<>();
        for (int r : primitiveRatings) combined.add(r);
        combined.addAll(objectRatings);
        int sum = 0;
        int count = 0;
        for (Integer r : combined) {
            if (Objects.nonNull(r)) {
                sum += r;
                count++;
            }
        }
        double avg = count == 0 ? 0.0 : (double) sum / count;
        System.out.println("Average: " + avg);
    }
}
