public class NumberMain {
    public static int sumOfProperDivisors(int number) {
        int sum = 1; 
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                int pair = number / i;
                if (pair != i && pair != number) {
                    sum += pair;
                }
            }
        }
        return (number == 1) ? 0 : sum;
    }

    public static boolean isPerfect(int number) {
        return sumOfProperDivisors(number) == number;
    }
    public static boolean isAbundant(int number) {
        return sumOfProperDivisors(number) > number;
    }
    public static boolean isDeficient(int number) {
        return sumOfProperDivisors(number) < number;
    }

    public static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 145; 

        System.out.println("Number: " + number);
        System.out.println("Is Perfect? " + isPerfect(number));
        System.out.println("Is Abundant? " + isAbundant(number));
        System.out.println("Is Deficient? " + isDeficient(number));
        System.out.println("Is Strong? " + isStrong(number));
    }
}
