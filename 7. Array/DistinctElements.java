import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DistinctElements {
    public static void main(String[] args) {
        // Example array with duplicate elements
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};

        // Finding distinct elements using a Set
        int[] distinctElements = findDistinctElements(array);

        // Printing the result
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Distinct elements: " + Arrays.toString(distinctElements));
    }

    public static int[] findDistinctElements(int[] array) {
        // Using a Set to store distinct elements
        Set<Integer> distinctSet = new HashSet<>();

        // Adding elements to the Set
        for (int element : array) {
            distinctSet.add(element);
        }

        // Converting Set back to array
        int[] distinctArray = new int[distinctSet.size()];
        int index = 0;
        for (int element : distinctSet) {
            distinctArray[index++] = element;
        }

        return distinctArray;
    }
}
