import java.util.ArrayList;
import java.util.Collections;

public class Q10_EmployeeAges {
    public static void main(String[] args) {
        int[] ages = {34, 28, 45, 22, 39, 60};
        ArrayList<Integer> list = new ArrayList<>();
        for (int a : ages) list.add(a);
        int youngest = Collections.min(list);
        int oldest = Collections.max(list);
        System.out.println("Youngest: " + youngest);
        System.out.println("Oldest: " + oldest);
    }
}
