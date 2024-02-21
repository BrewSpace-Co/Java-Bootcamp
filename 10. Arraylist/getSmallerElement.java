import java.util.ArrayList;

public class getSmallerElement {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add some elements to the ArrayList
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(12);

        // Get the smallest element
        int smallestElement = getSmallestElement(numbers);

        // Display the result
        System.out.println("The smallest element in the ArrayList is: " + smallestElement);
    }

    // Function to get the smallest element in an ArrayList
    public static int getSmallestElement(ArrayList<Integer> list) {
        // Check if the list is not empty
        if (list.isEmpty()) {
            throw new IllegalArgumentException("ArrayList is empty");
        }

        // Initialize the smallest element with the first element in the list
        int smallest = list.get(0);

        // Iterate through the remaining elements
        for (int i = 1; i < list.size(); i++) {
            // Update the smallest element if a smaller one is found
            if (list.get(i) < smallest) {
                smallest = list.get(i);
            }
        }

        // Return the smallest element
        return smallest;
    }
}
