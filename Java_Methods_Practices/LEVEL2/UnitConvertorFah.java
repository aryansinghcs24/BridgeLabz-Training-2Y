public class UnitConvertorFah {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args) {
        System.out.println("68 F in Celsius: " + convertFahrenheitToCelsius(68));
        System.out.println("20 C in Fahrenheit: " + convertCelsiusToFahrenheit(20));
        System.out.println("100 lbs in kg: " + convertPoundsToKilograms(100));
        System.out.println("45 kg in lbs: " + convertKilogramsToPounds(45));
        System.out.println("10 gallons in liters: " + convertGallonsToLiters(10));
        System.out.println("30 liters in gallons: " + convertLitersToGallons(30));
    }
}
