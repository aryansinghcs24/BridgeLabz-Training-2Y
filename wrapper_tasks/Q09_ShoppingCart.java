public class Q09_ShoppingCart {
    public static void main(String[] args) {
        String[] prices = {"250", "499", "99", "abc"};
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
