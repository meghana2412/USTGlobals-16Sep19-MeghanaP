 console.log('==with function name==');
 function fibonancci(num)
{
var first=0,second=1,next,i;
console.log(first);
console.log(second);
for(i=2; i<=num; i++)
{
    next=first+second;
    first=second;
    second=next;
    console.log(next);
}
}
fibonancci(10)

console.log('==with function expression==');
 var fibonancci = function (num)
{
var first=0,second=1,next,i;
console.log(first);
console.log(second);
for(i=2; i<=num; i++)
{
   next=first+second;
   first=second;
   second=next;
   console.log(next);
}
}
 var fib =fibonancci(10)

 console.log('==self invoked function ==');
 (function (num)
{
var first=0,second=1,next,i;
console.log(first);
console.log(second);
for(i=2; i<=num; i++)
{
    next=first+second;
    first=second;
    second=next;
    console.log(next);
}
})
(10)

console.log('==fat arrow function ==');
  var fibonancci=  (num)=>
{
var first=0,second=1,next,i;
console.log(first);
console.log(second);
for(i=2; i<=num; i++)
{
    next=first+second;
    first=second;
    second=next;
    console.log(next);
}
}
fibonancci(10)