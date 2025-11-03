public class SpringSeason {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }

        try {
            int month = Integer.parseInt(args[0]);
            int day = Integer.parseInt(args[1]);
            if (isSpring(month, day)) {
                System.out.println("It's a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide month and day as integers.");
        }
    }
    public static boolean isSpring(int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if (month == 3 && day >= 20) {
            return true;
        }
        else if (month >= 4 && month <= 5) {
            return true;
        }
        else if (month == 6 && day <= 20) {
            return true;
        }
        return false;
    }
}