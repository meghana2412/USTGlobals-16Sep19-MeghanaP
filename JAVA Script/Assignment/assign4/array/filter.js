// const number =[100,200,300,400];
//  const number1 =number.filter(function(value){
//     return value > 200
//  });
  
// console.log(number1);

// console.log('==fat arrow==')
//  const num2 = number.filter(value=>value>100)
//  console.log(num2)

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
const item1 = items.filter(function (items) {
    if(  items.price>200)
    return true;
    else
    return false;
})
console.log(item1)

const filteredItem =items.filter((item)=>item.price>3000)
console.log(filteredItem)
console.log(items)