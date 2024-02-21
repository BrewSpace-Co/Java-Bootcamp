import java.util.Scanner;

public class invertedRightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt();

        for (int i = num; i >=1 ; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
        System.out.println();
        }
       
        
        scanner.close();


    }
}
