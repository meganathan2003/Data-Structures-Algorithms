package SearchingAlogrithms;
/* *
 Here the binary search code will be 
 * there and this is time complex is 
 * O(log n) 
 * 
 * @author meganathan
 */

public class BinarySearch {

    // Create a static method
    public static int binarySearch(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;

        }
        // 1, 3, 57, 9

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                left = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 9, 10 };

        int target = 10;

        int result = binarySearch(nums, target);

        if (result != -1) {

            System.out.println("Element found At Index : " + result);
        } else {
            System.out.println("Element is not found");
        }
    }

}
