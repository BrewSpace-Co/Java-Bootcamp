public class checkSortedArray {
    public static boolean isSorted(int[] arr) {
        int n = arr.length;

        // Check each element with its adjacent one
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        // If the loop completes without returning false, the array is sorted
        return true;
    }

    public static void main(String[] args) {
        // Example usage
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] unsortedArray = {7, 2, 9, 1, 5};

        System.out.println("Is sortedArray sorted? " + isSorted(sortedArray));
        System.out.println("Is unsortedArray sorted? " + isSorted(unsortedArray));
    }
}
