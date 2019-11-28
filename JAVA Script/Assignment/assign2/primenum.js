console.log('==function name==')
function prime(num) {
    var num;
    if(num%2==0)
    {
        console.log('number is prime')
    }
   else{
       console.log('number is not a prime')
   }
    
} prime(12);

console.log('==function expression==')
 var prime=function (num) {
    var num;
    if(num%2==0)
    {
        console.log('number is prime')
    }
   else{
       console.log('number is not a prime')
   }
    
} 
var value=prime(12);
var value=prime(13);

console.log('==self invoked function==');
(function (num) {
    var num;
    if(num%2==0)
    {
        console.log('number is prime')
    }
   else{
       console.log('number is not a prime')
   }
    
}) (12);

console.log('==fat arrow function==')
var prime=(num)=> {
    var num;
    if(num%2==0)
    {
        console.log('number is prime')
    }
   else{
       console.log('number is not a prime')
   }
    
}
var value2= prime(12);