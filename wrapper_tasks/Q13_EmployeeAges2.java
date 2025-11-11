import java.util.ArrayList;
import java.util.Collections;

public class Q13_EmployeeAges2 {
    public static void main(String[] args) {
        int[] ages = {19, 42, 31, 58, 23, 45, 29};
        ArrayList<Integer> list = new ArrayList<>();
        for (int a : ages) list.add(a);
        int youngest = Collections.min(list);
        int oldest = Collections.max(list);
        System.out.println("Youngest: " + youngest);
        System.out.println("Oldest: " + oldest);
    }
}
