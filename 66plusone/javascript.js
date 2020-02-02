/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    let addIndex = digits.length -1;
    while (digits[addIndex] === 9){
        digits[addIndex] = 0;
        --addIndex;
    }
    if (addIndex == -1){
        return [1, ...digits];
    }
    ++digits[addIndex];
    return digits;
};