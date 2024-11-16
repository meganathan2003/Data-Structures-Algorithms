
/**
 * 
 * @param {Array} nums 
 * @param {number} target 
 */
function BinarySearch(nums, target) {

    if (!nums) {
        return [];
    }
    var left = 0;
    var right = nums.length - 1;

    while (left <= right) {
        let mid = (left + right) / 2;
        if (nums[mid] === target) {
            return mid;
        }
        else if (nums[mid] < target) {
            left = mid + 1;
        }
        else {
            right = mid - 1;
        }
    }

    return -1;
}
const arr = [1, 2, 4, 5, 6, 7, 8];
const target = 8;
console.log(BinarySearch(arr, target));
