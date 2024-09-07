/**
 * Here the example of the linear
 * search the time complex is linear
 * search is O(n) . This problem is
 * find the element in the array
 */

public class LinearSearch {

    public static int linearSearch(int[] nums, int target) {

        if (nums.length == 0) {
            return 0;
        }

        // Here for loop find the value
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int nums[] = { 1, 3, 57, 9 };

        int target = 9;

        int result = linearSearch(nums, target);

        if (result != -1) {

            System.out.println("Element found At Index : " + result);
        } else {
            System.out.println("Element is not found");
        }

    }

}