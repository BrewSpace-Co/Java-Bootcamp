import java.util.Scanner;

public class fibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int terms = scanner.nextInt();

        System.out.println("Fibonacci sequence up to " + terms + " terms:");
        printFibonacci(terms);

        scanner.close();
    }

    // Function to print Fibonacci sequence up to n terms
    public static void printFibonacci(int n) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
