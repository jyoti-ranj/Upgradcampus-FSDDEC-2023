function compareArrays(array1, array2) {
    return new Promise((resolve, reject) => {
      
      if (array1.length !== array2.length || !array1.every((value, index) => value === array2[index])) {
        reject("The arrays are not identical.");
      } else {
        resolve("The arrays are identical.");
      }
    });
  }
  
  
  const array1 = [1, 2, 3];
  const array2 = [1, 2, 3];
  
  compareArrays(array1, array2)
    .then(message => {
      console.log(message); 
    })
    .catch(error => {
      console.error(error); 
    });
  
  const array3 = [1, 2, 3];
  const array4 = [1, 2, 4];
  
  compareArrays(array3, array4)
    .then(message => {
      console.log(message); 
    })
    .catch(error => {
      console.error(error); 
    });
  