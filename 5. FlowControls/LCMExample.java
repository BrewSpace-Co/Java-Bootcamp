import java.util.Scanner;

public class LCMExample {
    // Function to calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
    public static int calculateLCM(int a, int b) {
        // Calculate GCD using the Euclidean algorithm
        int gcd = calculateGCD(a, b);

        // Calculate LCM using the formula
        int lcm = (a * b) / gcd;
        return lcm;
    }

    // Function to calculate GCD using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate LCM
        int lcm = calculateLCM(num1, num2);

        // Display the result
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        // Close the scanner
        scanner.close();
    }
}
