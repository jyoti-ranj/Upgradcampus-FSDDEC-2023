function compareStrings(string1, string2) {
    return new Promise((resolve, reject) => {
      if (string1 === string2) {
        resolve("The strings are equal.");
      } else {
        reject("The strings are not equal.");
      }
    });
  }
  
  
  compareStrings("hello", "hello")
    .then(message => {
      console.log(message); 
    })
    .catch(error => {
      console.error(error); 
    });
  
  compareStrings("hello", "world")
    .then(message => {
      console.log(message); 
    })
    .catch(error => {
      console.error(error); 
    });
  