
// returns the nth fibonancci number
const fib = (n) => {
    if (n == 1 || n == 2){
        return 1;
    } else {
        let first = 1, second = 1, times = n - 2;
        for (i = times; i > 0; i--){
            let temp = first + second;
            first  = second;
            second = temp;
        }
        return second
    }
}

console.log(fib(21))

// 1 1 2 3 5 8 13 21 34 55