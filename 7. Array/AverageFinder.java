import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AverageFinder {
    public static void main(String[] args) {
        // Example array with duplicate elements
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};

        // Finding distinct elements
        int[] distinctElements = findDistinctElements(array);

        // Calculating the average of distinct elements
        double average = calculateAverage(distinctElements);

        // Printing the result
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Distinct elements: " + Arrays.toString(distinctElements));
        System.out.println("Average of distinct elements: " + average);
    }

    public static int[] findDistinctElements(int[] array) {
        Set<Integer> distinctSet = new HashSet<>();
        for (int element : array) {
            distinctSet.add(element);
        }

        int[] distinctArray = new int[distinctSet.size()];
        int index = 0;
        for (int element : distinctSet) {
            distinctArray[index++] = element;
        }

        return distinctArray;
    }

    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int sum = 0;
        for (int element : array) {
            sum += element;
        }

        return (double) sum / array.length;
    }
}
