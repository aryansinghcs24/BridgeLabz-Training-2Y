import java.util.ArrayList;
import java.util.List;

public class Q18_StudentMarksReport {
    public static void main(String[] args) {
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "77", "abc", 66};
        List<Integer> marks = new ArrayList<>();
        for (Object obj : inputs) {
            if (obj instanceof Integer) {
                marks.add((Integer) obj);
            } else if (obj instanceof String) {
                String s = (String) obj;
                if (s.equalsIgnoreCase("null")) {
                } else {
                    try {
                        marks.add(Integer.parseInt(s));
                    } catch (NumberFormatException e) {
                    }
                }
            }
        }
        int sum = 0;
        for (Integer m : marks) sum += m;
        double avg = marks.isEmpty() ? 0.0 : (double) sum / marks.size();
        System.out.println("Count: " + marks.size());
        System.out.println("Average: " + avg);
    }
}
