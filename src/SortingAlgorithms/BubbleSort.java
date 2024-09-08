package SortingAlgorithms;

/**
 * Here the sorting algo we are
 * sort the element in fastest way
 * how bubble sort work like is we
 * compare two values and create a
 * tempo variable and swap the value
 * <p>
 * Time complex is = O(n^2)
 *
 * @author meganathan
 */
public class BubbleSort {

    // Create a bubble sort method
    public static int[] bubbleSort(int[] nums) {

        if (nums.length == 0) {
            return new int[0];
        }

        // Here we are going to use two loop
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) { // 10 > 2
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }
            }
        }
        System.out.println();

        return nums;
    }

    public static void main(String[] args) {

        // create a arr
        int[] arr = {10, 2, 8, 7, 9, 45};
        System.out.println("Before Sorting ");
        for (int num : arr) {
            System.out.println(num + " ");
        }
        int[] res = bubbleSort(arr);

        System.out.println();
        System.out.println("After Sorting ");
        for (int num : res) {
            System.out.println(num + " ");
        }

    }

}
