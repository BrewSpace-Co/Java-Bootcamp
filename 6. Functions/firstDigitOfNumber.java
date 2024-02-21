

import java.util.Scanner;

public class firstDigitOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int firstDigit = findFirstDigit(number);

        System.out.println("The first digit of the number is: " + firstDigit);

        scanner.close();
    }

    // Function to find the first digit of a number
    private static int findFirstDigit(int num) {
        // Take the absolute value to handle negative numbers
        num = Math.abs(num);

        // Keep dividing by 10 until the first digit is reached
        while (num >= 10) {
            num /= 10;
        }

        return num;
    }
}
