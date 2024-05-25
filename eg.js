// var newData = {
//     'firstName':'Mark',
//     'Mobile':123456,
//     'address':{
//         'city':'Mumbai'
//     }
// };


// console.log(newData.hasOwnProperty('firstName'));
// console.log(typeof newData['Mobile']);
var planet = {
    id: 756,
    Info: {
        name: 'Epsilon',
        location: {
            cluster: 'Odin galaxy'
        },
        satellite:{
        	name: 'Cygnus',
        	location:{
        		cluster: 'Icarus belt'
        	}
        }
    }
}

planet.Info['satellite'].location['cluster']