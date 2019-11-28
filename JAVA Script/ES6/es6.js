const message = new Promise(function(resolve,reject){
    if(30>10){
        resolve('Success')
    }else{
        reject('failed')
    }
})
message.then(function (msg) {
    console.log('Success Message',msg)
}).catch(function (error) {
  console.log('Failure Message',error)  
})


const employees = new Promise(function(resolve,reject){
    if(30>10){
        resolve([{
                  name :'Meghana',
                  age :21,
                 },{
                   name : 'Pavan',
                   age :22
                  }])
    }else{
        reject('failed')
    }
})
employees.then(function (info) {
    console.log('Employee details',info)
}).catch(function (error) {
  console.log('Failure Message',error)  
})
// Closures
 function outerFunction(counter) {
     function innerFunction() {
         let count;
         count = counter + 10
         return count
     }
     return innerFunction
 }
 let innerFunc = outerFunction(10 )
 let counter = innerFunc()
 console.log('Counter Value', counter)
  