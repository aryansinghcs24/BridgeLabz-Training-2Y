import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatUtils {
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class Date_Format_Utility {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        String format1 = DateFormatUtils.formatDate(today, "dd-MM-yyyy");
        String format2 = DateFormatUtils.formatDate(today, "MMMM dd, yyyy");
        String format3 = DateFormatUtils.formatDate(today, "yyyy/MM/dd");

        System.out.println("Format 1: " + format1); 
        System.out.println("Format 2: " + format2); 
        System.out.println("Format 3: " + format3); 
    }
}
