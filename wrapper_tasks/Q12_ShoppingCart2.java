public class Q12_ShoppingCart2 {
    public static void main(String[] args) {
        String[] prices = {"100", "200", "300", "xyz", "50"};
        int total = 0;
        for (String p : prices) {
            try {
                total += Integer.parseInt(p);
            } catch (NumberFormatException e) {
            }
        }
        System.out.println("Total: " + total);
    }
}
