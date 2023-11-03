
const num1 = prompt('Insert the first number');
const num2 = prompt('Insert the second number');
const num3 = prompt('Insert the third number');

let numbers = [];

numbers.push(num1,num2,num3)
numberAscendent = numbers.sort((a, b) => a - b)
numbersDescendent = numbers.sort((a, b) => b - a)


let compare = numbers[0] ===numbers[1] === numbers [2] ? 
"Numbers are the same" : `${numberAscendent , numbersDescendent}`


console.log(compare)