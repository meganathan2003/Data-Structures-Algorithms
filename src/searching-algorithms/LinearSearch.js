
/**
 * 
 * @param {Array} arr 
 * @param {number} target
 * @param {Array}
 */
function LinearSearch(arr, target) {

    if (arr.length == 0) {
        return [];
    }

    for (var i = 0; i < arr.length; i++) {
        if (arr[i] === target) {
            return i;
        }
    }

    return -1;
}

const nums = [1, 4, 5, 6, 7];
const target = 5;
console.log(LinearSearch(nums, target));
