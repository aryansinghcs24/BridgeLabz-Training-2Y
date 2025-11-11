import java.util.ArrayList;

public class Q19_PerformanceBenchmark {
    public static void main(String[] args) {
        int n = 1_000_000;
        long t1 = System.nanoTime();
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) list.add(i);
        long t2 = System.nanoTime();
        long sumList = 0;
        for (int i = 0; i < list.size(); i++) sumList += list.get(i);
        long t3 = System.nanoTime();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;
        long t4 = System.nanoTime();
        long sumArr = 0;
        for (int i = 0; i < n; i++) sumArr += arr[i];
        long t5 = System.nanoTime();
        System.out.println("ArrayList add ms: " + (t2 - t1) / 1_000_000.0);
        System.out.println("ArrayList sum ms: " + (t3 - t2) / 1_000_000.0);
        System.out.println("int[] fill ms: " + (t4 - t3) / 1_000_000.0);
        System.out.println("int[] sum ms: " + (t5 - t4) / 1_000_000.0);
        System.out.println("sumList: " + sumList + ", sumArr: " + sumArr);
    }
}
