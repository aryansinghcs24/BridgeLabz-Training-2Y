public class Q11_AgeValidation {
    public static boolean isValidAdult(String ageStr) {
        try {
            int age = Integer.parseInt(ageStr);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        String[] tests = {"17", "18", "21", "abc", "-5"};
        for (String t : tests) {
            System.out.println(t + " -> " + isValidAdult(t));
        }
    }
}
