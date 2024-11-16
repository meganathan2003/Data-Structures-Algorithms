
/**
 * This is sorting algorithm for 
 * sort the array
 * @param {string} arr 
 * @returns {Array} 
 */

function bubbleSort(arr) {

    if (arr.length == 0) {
        return [];
    }
    for (var i = 0; i < arr.length; i++) {
        for (var j = i + 1; j < arr.length; j++) {
            if (arr[i] >= arr[j]) {
                let temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return arr;

};

const arr = [10, 11, 5, 6, 1, 2];
console.log(bubbleSort(arr));



