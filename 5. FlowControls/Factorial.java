import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer to find its factorial: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is undefined for negative numbers.");
        } else {
            long result = calculateFactorial(n);
            System.out.println("Factorial of " + n + " is: " + result);
        }

        scanner.close();
    }

    private static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return (long) num * calculateFactorial(num - 1);
        }
    }
}
