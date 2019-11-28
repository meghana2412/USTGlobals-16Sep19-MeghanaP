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
 const item = items.map(function(items){
     items.price= items. price + 300
    return items;
})
console.log('after map method',item);
console.log(items)

console.log('==fat arrow function==');
const item2 = items.map((value)=>{
     value.price = value.price+300
   return value
})
console.log(item2);