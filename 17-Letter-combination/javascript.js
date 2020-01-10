/**
 * @param {string} digits
 * @return {string[]}
 */
var dict = {
    2:["a","b","c"],
    3:["d","e","f"],
    4:["g", "h","i"],
    5:["j","k","l"],
    6:["m", "n", "o"],
    7:["p", "q", "r", "s"],
    8:["t", "u","v"],
    9:["w", "x", "y", "z"]
}
var letterCombinations = function(digits) {
    var digArr = digits.split("");
    let res = dict[digArr[0]];
    for (let i = 1; i < digArr.length;i++){
        res = crossProduct(res, dict[digits[i]])
    }
    return res;
};

var crossProduct = (arr1, arr2) =>{
    let ans = [];
    for (let i in arr1){
        for (let a in arr2){
            ans.push(arr1[i]+arr2[a]);   
        }
    }
    return ans;
}
console.log(letterCombinations("23"))