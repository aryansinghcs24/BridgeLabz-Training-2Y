import java.util.*;
import java.util.stream.Collectors;

public class Name_Uppercasing {
    public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList("Alice", "bob", "ChArLie", "david");

        List<String> uppercasedNames = employeeNames
            .stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        uppercasedNames.forEach(System.out::println);
    }
}
