// division with 2 num
var num1 = 100;
var num2 = 50;
console.log(num1 / num2); //  output: 2

// division with string number
var num1 = "1000";
var num2 = 50;
console.log(num2 / num1); // NaN

var num1 = "Hello";
var num2 = 50;
console.log(num2 / num1); // NaN

var num1 = 0;
var num2 = 50;
console.log(num2 / num1);

var num1 = Infinity;
var num2 = 50;
console.log(num1 / num2); // infinity
console.log(num2 / num1); // 0
