// a function to validate input brackets of type ()
let solution = (s) =>{
    let count = 0;
    for (i = 0; i < s.length; i++){
        if (s[i] === '('){
            count++;
        } else if (i ==')' && count <=0){
            return false;
        } else {
            count--;
        }
    }
    return count === 0;
}

let solution = (s) =>{
    let types = ['(', '{', '[']
    let arr = [];
    for (i = 0; i < s.length; i++){
        if (types.includes(s[i])){
            arr.push(s[i]);
        } else if (arr[arr.length-1] === '' ){

        }
    }
}

const testCases = [ {'()': true}, {'(())':true}, {'()()': true}, {'(()': false},{'())': false}  ]

for (let val of testCases){
    let input = Object.keys(val)[0]
    let output = solution(input);
    let expected = val[input]
    if (output != expected){
        console.log(`Input:${input} Output:${output} Expected:${expected}`)
    } 
}