
function getData() {
    return new Promise((resolve, reject) => {
      
      setTimeout(() => {
        const success = Math.random() < 0.8; 
        if (success) {
          resolve("Data successfully fetched!");
        } else {
          reject("Error: Unable to fetch data.");
        }
      }, 1000);
    });
  }
  
  
  getData()
    .then(data => {
      console.log("Success:", data); 
    })
    .catch(error => {
      console.error("Error:", error); 
    });
  