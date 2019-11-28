console.log('==with function name==')
function factorial(num)
 {
    var factorial = 1,i;
    for(i=1; i<=num;i++)
    factorial = factorial*i;
    console.log('fact=', factorial);
}
factorial(5)

console.log('===with function expression')
var factorial = function(num){
    var factorial = 1,i;
    for(i=1; i<=num;i++)
    factorial = factorial*i;
    console.log('fact=', factorial);
}
var fact = factorial(5)
console.log('==self invoked function==');
(function (num)
 {
    var factorial = 1,i;
    for(i=1; i<=num;i++)
    factorial = factorial*i;
    console.log('fact=', factorial);
}) (5)
 console.log('==with fat arrow function==');
 var factorial = (num)=>{
    var factorial = 1,i;
    for(i=1; i<=num;i++)
    factorial = factorial*i;
    console.log('fact=', factorial);
}
 factorial(5)