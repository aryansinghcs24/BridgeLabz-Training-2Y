import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double first = sc.nextDouble();
            
            System.out.print("Enter second number: ");
            double second = sc.nextDouble();
            
            System.out.print("Enter operator (+, -, *, /): ");
            String op = sc.next();
            
            switch (op) {
                case "+" -> System.out.println("Result: " + (first + second));
                case "-" -> System.out.println("Result: " + (first - second));
                case "*" -> System.out.println("Result: " + (first * second));
                case "/" -> {
                    if (second != 0) {
                        System.out.println("Result: " + (first / second));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
                default -> System.out.println("Invalid Operator");
            }
        }
    }
}