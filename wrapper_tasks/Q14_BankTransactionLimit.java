public class Q14_BankTransactionLimit {
    public static double remainingLimit(Double limit, double used) {
        if (limit == null) return 0.0;
        return Math.max(0.0, limit - used);
    }
    public static double remainingLimit(double limit, double used) {
        return Math.max(0.0, limit - used);
    }
    public static void main(String[] args) {
        Double limitObj = 5000.0;
        double used = 1234.5;
        System.out.println(remainingLimit(limitObj, used));
        System.out.println(remainingLimit((Double) null, used));
        System.out.println(remainingLimit(3000.0, 100.0));
    }
}
