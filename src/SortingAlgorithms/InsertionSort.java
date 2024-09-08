package SortingAlgorithms;

/**
 * Here the below is sorting algorithms
 * and this is one of woy to sort the
 * array basically you are shifting the
 * array not swapping using variable,and
 * you are travel the index from 1 and check
 * from the back side
 * <p>
 * Time complexity is -
 * </p>
 *
 * @author meganathan
 */
public class InsertionSort {

    // Create a new method
    public static int[] insertionSort(int[] arr) {

        int n = arr.length;
        if (arr.length == 0) {
            return new int[0];
        }

        // In insertion sort we start the loop from 1
        for (int i = 1; i < n; i++) {

            int key = arr[i]; // the current value there in key
            int j = i - 1; // which takes before value from the i

            while (j >= 0 && arr[i] > key) { // Here 0 we check for -1 index

                arr[j + 1] = arr[i]; // here we are shifting the value
                j--; //
            }
            arr[j + 1] = key;

        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 10, 7, 2, 1};
    }
}
