import java.util.Scanner;

public class CalendarDisplay {

    // Get the month name
    static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    // Check for leap year
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get the number of days in a month
    static int getMonthDays(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month - 1];
    }

    // Returns the weekday of the first of the month using Gregorian calendar formula (0 = Sunday)
    static int getFirstDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        // Adjust to make 0=Sunday, 1=Monday, ... 6=Saturday
        return (d0 + 7) % 7;
    }

    // Display the calendar
    static void printCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int days = getMonthDays(month, year);
        int startDay = getFirstDay(month, year);

        // Calendar Header
        System.out.printf("     %s %d\n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Indent first line to the correct start day
        for (int i = 0; i < startDay; i++) System.out.print("    ");

        // Print days
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if (((startDay + day) % 7 == 0) || (day == days)) System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        printCalendar(month, year);
    }
}
