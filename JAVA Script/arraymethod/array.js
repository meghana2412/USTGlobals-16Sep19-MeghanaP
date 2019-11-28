const hobbies =['singing','dancing','acting','watching movies','roaming']
console.log(typeof hobbies);
const isArrayorNot = Array.isArray(hobbies)
console.log('Hobbies array or not',isArrayorNot);
const hasDancing = hobbies.includes('dancing');
console.log('using includes method',hasDancing)
hobbies.push('guitar','kabbadi');
console.log('After push method',hobbies);
hobbies.pop()
console.log('After pop method',hobbies);
hobbies.unshift('numismatics','helpinghand')
console.log('after unshift method',hobbies)
hobbies.shift()
console.log('after shift method', hobbies);


const hobbies1 =['sleeping','cricket','eating','coding','roaming'];
var hob =hobbies1.splice(1,0,'bird wastching','PUBG');
console.log('after splice methid',hob);

const hobbies2 =['sleeping','cricket','eating','coding','roaming'];
 var hob1 =hobbies2.splice(1,2,'bird wastching','PUBG');
console.log('after splice1 methid',hob1);

const afterSlice = hobbies1.slice(2,4);
console.log('before slice method',hobbies1);
console.log('after slice method',afterSlice);

const indexOfCoding = hobbies1.indexOf('coding',2);
console.log('Index of coding',indexOfCoding);

const separator = hobbies1.join('**');
console.log('separator of string',separator);

const number=[100,200,300,400];
const number1 = number.map(function(value,index){
    let newValue= value+50
    return newValue;
})
console.log('after map method',number1)


 const num1 =number.map(value=>value+50);
 console.log('after map arrow function',num1);

 const num2= number.filter(function(value,index){
         if (value> 200){
             return true
         } else{
             return false
         }
 })
 console.log('filtered array is',num2)

 const num3 =number.filter(value=> value>200);
 console.log('fat filtered array',num3);


 const items =[ {
     name: 'earring',
     id:1,
     price:5000
 },{
    name: 'kajal',
    id:2,
    price:1000
 },{
    name: 'compact',
    id:3,
    price:2000
 },{
    name: 'foundation',
    id:4,
    price:1500
 },{
    name: 'concealer',
    id:5,
    price:1500,
 },{
    name: 'lipstick',
    id:6,
    price:200,
 }]