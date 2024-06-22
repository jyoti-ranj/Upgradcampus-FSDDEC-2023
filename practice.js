function foo(x){
    console.log(x);
}
var name = "Jyoti";
foo(name);
function foo(x){
    console.log(x);
    x = 'sskshi'
    console.log(x);
}
console.log(name)

let x = 10; // x holds the value 10

function changeValue(a) {
    a = 20; // Changing the value of 'a' to 20
}

changeValue(x); // Call the function with x

console.log(x); // Output: 10, because x is not changed inside the function