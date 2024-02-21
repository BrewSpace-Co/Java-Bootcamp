import java.util.Scanner;

public class allDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Divisors of " + number + " are: ");
        printDivisors(number);

        scanner.close();
    }

    // Function to print all divisors of a given number
    public static void printDivisors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
