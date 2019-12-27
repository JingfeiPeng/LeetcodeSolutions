// does not check for int max and min
var reverse = function(x) {
    let newInt = 0;
    while (x != 0){
        let lastDigit = x % 10;
        x -=lastDigit;
        x /= 10;
        newInt = newInt*10+ lastDigit;
    }
    return newInt;
};

console.log(reverse(123))
console.log(reverse(-123))