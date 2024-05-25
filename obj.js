var newData = {
    'firstName':'Jyoti',
    'Mobile':123456,
    'address':{
        'city':'Mumbai'
    }
};

console.log(newData.Mobile);
delete newData.address['city'];
console.log(newData.address.city);
console.log(newData.firstName);

 delete newData.address['city'];

// console.log(newData.address.pincode);

var music = {
    rock: 'guitar',
    classical: 'violin'
  };
  var  classical = 'rock';
  var  sound = music[classical];
  console.log(sound);


  var  music = {
    rock: 'guitar',
    classical: 'violin'
  };
  var  classical = 'rock';
  var  sound = music.classical;
  console.log(sound);


  var person = {
    id: 101,
    email: 'alice11@gmail.com',
    personalInfo: {
        name: 'Alice',
        address: {
            line1: 'Smith Avenue',
        }
    }
};
var info = person.personalInfo["name"]
console.log(info);

