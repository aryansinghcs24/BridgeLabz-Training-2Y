import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;
    boolean urgent;

    Alert(String type, String message, boolean urgent) {
        this.type = type;
        this.message = message;
        this.urgent = urgent;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message + (urgent ? " (URGENT)" : "");
    }
}

public class Notification_Filtering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Medication", "Time to take blood pressure meds", false),
            new Alert("Appointment", "Doctor appointment in 1 hour", true),
            new Alert("Vitals", "Low heart rate detected", true),
            new Alert("Medication", "Take vitamin D", false)
        );

        filterAndShow(alerts, alert -> alert.urgent);

        filterAndShow(alerts, alert -> alert.type.equals("Medication"));

        filterAndShow(alerts, alert -> alert.type.equals("Appointment") && !alert.urgent);
    }

    static void filterAndShow(List<Alert> alerts, Predicate<Alert> filter) {
        System.out.println("--- Filtered Alerts ---");
        alerts.stream()
              .filter(filter)
              .forEach(System.out::println);
    }
}
