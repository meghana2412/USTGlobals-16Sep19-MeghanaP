console.log('==with function name==');
function circumference(rad){
     var rad;
     circum= 2* Math.PI*rad;
     console.log('circum=', circum)

}
circumference(2)

console.log('== function expression==');
 var circumference =function (rad){
     var rad;
     circum= 2* Math.PI*rad;
     console.log('circum=', circum)

}
 var circum =circumference(2)

 console.log('==self invoked function ==');
(function (rad){
     var rad;
     circum= 2* Math.PI*rad;
     console.log('circum=', circum)

})
(2)

console.log('==fat arrow function ==');
var circumference =(rad)=>{
     var rad;
     circum= 2* Math.PI*rad;
     console.log('circum=', circum)

}
circumference(2)