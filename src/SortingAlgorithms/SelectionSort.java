package SortingAlgorithms;

/**
 * Here the Sorting algo name is
 * Selection Sort we swap the two values in
 * outer loop and we took the maximum value
 * in the array and compare with all ele and
 * swap the value .
 * But still this is better than bubble sort
 * this reduce the number of swapping times.
 * Time complex - O(n^2)
 *
 * @author meganathan
 */
public class SelectionSort {

    // Create a separate method
    public static int[] selectionSort(int[] arr) {


        int n = arr.length;
        int temp = 0;
        int minIndex = -1;

        if (arr.length == 0) {
            return new int[0];
        }

        // This loop for find the minim value in the array
        for (int i = 0; i < n; i++) {
            // We assume that the array first value will be max
            minIndex = i;
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[minIndex] > arr[j]) { // arr[0] > arr[1] = 6 > 5
                    minIndex = j; // change the min Index
                }
            }

            // This logic where we are swap the value
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;


        }
    }

    public static void main(String[] args) {

    }

}
