//NAmed Functions
function add(num1,num2) {
    console.log('Sum =', num1+num2);
    
}
add(10,20)
// function add(num1,num2,num3) {
//     console.log('Sum Value=', num1+num2+num3);
   
// }
// add(10,20,30)
//Function expression
var sub = function (num1,num2) {
    console.log('sub =', num1-num2);
    return num1-num2;
}
var value = sub(20,10);
console.log('Value=',value);
console.log('====self invoked function=====');
(function(num1,num2){
    console.log('value1 =', num1*num2);
})(10,20)
console.log('========fat arrow function=========')
var div1=(num1,num2)=>{
    console.log('value2=',num1/num2);
}
div1(10,5);
console.log('=======one variable======')

var div2 = num1 =>{
    console.log('value3 =',num1)
}
div2(20)
console.log('=====without curlybraces===')
var add2 =(num1,num2)=>num1+num2;
var value4 = add2(10,20);
console.log('Value4=',value4);

console.log('====call before named function===')
greeting('Sachin');
function greeting(msg){
    console.log('hello',msg)

console.log('=====call before declaration====');
add9(5,5);
var add9=function(num1,num2){
    console.log('vaule9 =', add9);
} 

console.log('==== call before with fat arrow===')
greet1('Pavan')
var greet1 =(msg)=>{
    console.log('hello',msg);
}

}
