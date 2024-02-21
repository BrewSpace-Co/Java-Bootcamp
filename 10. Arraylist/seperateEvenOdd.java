import java.util.ArrayList;

public class seperateEvenOdd {

    public static void main(String[] args) {
        // Sample ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(10);
        numbers.add(7);
        numbers.add(8);
        numbers.add(15);

        // Separating even and odd numbers
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        // Printing the results
        System.out.println("Original Numbers: " + numbers);
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}
