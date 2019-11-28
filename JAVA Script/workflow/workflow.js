// function first(){
//     setTimeout(function first(){
        
//         console.log('First Function Executed')
//     }, 0 )
    
// }

// function second(){
//     console.log('Second Function Executed')
// }

// first()
// second()

console.log('call back function==');
function first(callback){
    setTimeout(function(){
        console.log('First function executed')
        callback();
    },0)
}

function second(){
    console.log('Second Function Executed')
}

first(second)
