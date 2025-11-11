import java.util.ArrayList;

public class Q03_AutoboxingSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(15);
        int sum = 0;
        for (Integer x : list) {
            sum += x;
        }
        System.out.println("Sum of numbers = " + sum);
    }
}
