console.log('==function name==')

function add(array) {
    
    var i, sum=0;
    for(i=0; i<array.length; i++)
    {
        sum=sum+array[i]
    }
    console.log('sum=',sum);
}
var array=[10,20,30,40];
add(array);

console.log('==function expression==')

 var add=function (array) {
    
    var i, sum=0;
    for(i=0; i<array.length; i++)
    {
        sum=sum+array[i]
    }
    console.log('sum=',sum);
}
var array=[10,20,30,40];
 var addition =add(array);

 console.log('==self invoked function==');

(function (array) {
    
    var i, sum=0;
    for(i=0; i<array.length; i++)
    {
        sum=sum+array[i]
    }
    console.log('sum=',sum);
})(array);
var array=[10,20,30,40];

console.log('==fat arrow function==')

 var add=(array)=> {
    
    var i, sum=0;
    for(i=0; i<array.length; i++)
    {
        sum=sum+array[i]
    }
    console.log('sum=',sum);
}
var array=[10,20,30,40];
add(array);
 