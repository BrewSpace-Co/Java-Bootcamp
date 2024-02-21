import java.util.Scanner;

public class invertedTrianglePattern {
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the number of rows for the inverted triangle: ");
        int numberOfRows = scanner.nextInt();

        
        for (int i = numberOfRows; i >= 1; i--) {
            // Loop to print spaces before the stars
            for (int j = 0; j < numberOfRows - i; j++) {
                System.out.print(" ");
            }

            // Loop to print stars for each row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
        
    }
}
