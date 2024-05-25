
const add = (a, b) => a + b;


const subtract = (a, b) => a - b;


const multiply = (a, b) => a * b;


const divide = (a, b) => {
    if (b === 0) {
        return "Cannot divide by zero";
    } else {
        return a / b;
    }
};
const modulo = (a, b) => a % b;

console.log("Addition:", add(5, 3)); 
console.log("Subtraction:", subtract(5, 3)); 
console.log("Multiplication:", multiply(5, 3)); 
console.log("Division:", divide(5, 3)); 
console.log("Division by zero:", divide(5, 0)); 
console.log("Modulo:", modulo(2, 4)); 
