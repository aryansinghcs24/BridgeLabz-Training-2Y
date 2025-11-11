public class Q05_WrapperUtilityMethods {
    public static void main(String[] args) {
        int p = Integer.parseInt("123");
        double q = Double.parseDouble("3.14");
        boolean r = Boolean.parseBoolean("true");
        String bin = Integer.toBinaryString(10);
        boolean isDigit = Character.isDigit('5');
        char upper = Character.toUpperCase('a');
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(bin);
        System.out.println(isDigit);
        System.out.println(upper);
    }
}
