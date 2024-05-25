const cond = (a , b) => {
    if(a >= 40){
        return "Today is Hot"
    }
    else{
         return "Today is not so hot"
    }
}

console.log("Today's Weather:" ,cond(45))