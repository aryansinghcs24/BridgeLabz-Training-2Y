import java.util.Scanner;

public class HeightCmToFeetAndInches {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double heightCm = in.nextDouble();   // I/P => height in centimeters
            double totalInches = heightCm / 2.54;
            int feet = (int) (totalInches / 12);
            double inches = totalInches - feet * 12;
            
            System.out.println(
                    "Your Height in cm is " + heightCm +
                            " while in feet is " + feet +
                            " and inches is " + inches
            );
        } // I/P => height in centimeters
    }
}
