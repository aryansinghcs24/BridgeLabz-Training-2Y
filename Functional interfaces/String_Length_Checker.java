import java.util.function.Function;

public class String_Length_Checker {
    public static void main(String[] args) {
        int charLimit = 20;
        Function<String, Integer> getLength = message -> message.length();

        String[] messages = {
            "Hello, world!",
            "This exceeds the character limit because it's too long."
        };

        for (String msg : messages) {
            int len = getLength.apply(msg);
            if (len > charLimit) {
                System.out.println("Message exceeds limit: " + len + " characters.");
            } else {
                System.out.println("Message is within limit: " + len + " characters.");
            }
        }
    }
}
