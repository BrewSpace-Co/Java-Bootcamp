import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select The Operation: \n1. Addition \n2. Subtraction \n3. Multiply \n4. Divide");

        int operation = sc.nextInt();

        if (operation != 1 && operation != 2 && operation != 3 && operation != 4) {
            System.out.println("Invalid Operation");
        } else {
            System.out.println("Enter First Number");
            int a = sc.nextInt();
            System.out.println("Enter Second Number");
            int b = sc.nextInt();
            
            if (operation == 1) {
                System.out.println(a + b);
            } else if (operation == 2) {
                System.out.println(a - b);
            } else if (operation == 3) {
                System.out.println(a * b);
            } else if (operation == 4) {
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Cannot divide by zero");
                }
            }
        }
    }
}
