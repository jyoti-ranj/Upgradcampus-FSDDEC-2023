
const classifyPositiveNumbers = (arr) => arr.filter(num => num > 0);


const classifyMultiplesOfThree = (arr) => arr.filter(num => num % 3 === 0);


const numbers = [-3, -2, -1, 0, 1, 2, 3, 4, 5, 6];
const positiveNumbers = classifyPositiveNumbers(numbers);
const multiplesOfThree = classifyMultiplesOfThree(numbers);

console.log("Positive numbers:", positiveNumbers); 
console.log("Multiples of three:", multiplesOfThree); 
/*1. Initialise an empty array named cart to store items,
2.  Create an arraow function named AddItem, that takes parameter item and price and adds an object representing
the item to the cartarray. Each item object should have properties name and price
3. Create an arrow function removeItem
4. create an arrow function clear cart --> empty the cart array
5. totalPrice -->total price of items
6. printCart --> print each item in the cart with name and price */


let cart = [];


const AddItem = (item,8:34 pm 
okay cool.8:34 pm
Shruti Groverlet cart = [];


const AddItem = (item, price) => {
  cart.push({ name: item, price: price });
};


const printCart = () => {
  cart.forEach((item) => {
    console.log(`${item.name}: ${item.price}`);
  });
};


const totalPrice = () => {
  let total = 0;
  cart.forEach((item) => {
    total += item.price;
  });
};


AddItem("Shirt", 20);
AddItem("Jeans", 30);
AddItem("Shoes", 50);


printCart();