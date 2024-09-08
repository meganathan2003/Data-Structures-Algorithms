package SortingAlgorithms;

/**
 * Here the one of best and efficient sorting
 * algorithms that is quick sort and here we use
 * the pivot and divide and conquer in the array
 * that means we divide the array and solve the problem
 * into sub problems and sort in the fastest way
 * pivot means - central point of the problem
 */
public class QuickSort {

    // create a new method
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);
            // keep calling the quick sort
            quickSort(arr, low, pi - 1); // this is for first partition
            quickSort(arr, pi + 1, high); // This is for second partition

        }

    }

    /**
     * This partition method will divide the arr into
     * two side and check the value the compare the values
     * and the sort the array by itself
     *
     * @param arr
     * @param low
     * @param high
     * @return
     */
    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;

    }

    public static void main(String[] args) {

        int[] arr = {5, 1, 9, 10, 6, 54, 34, 12};
        quickSort(arr, 0, arr.length - 1); //  array, low and high

        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
