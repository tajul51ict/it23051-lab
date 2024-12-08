import java.util.Scanner;

// Utility class for Factorion calculations
class FactorionUtils {

    // Method to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a factorion
    public static boolean isFactorion(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }
}

// Main class to find Factorion numbers within a range
public class FactorionFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        //System.out.println("Factorion numbers in the range:");

        // Find and display factorion numbers in the range
        boolean found = false;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (FactorionUtils.isFactorion(i)) {
                System.out.println(i);
                found = true;
            }
        }

     
    }
}
