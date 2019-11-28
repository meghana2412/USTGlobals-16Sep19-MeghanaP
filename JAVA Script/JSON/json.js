const person = {
              name : 'Sundara',
              age : 100,
              color : 'white',
               address : {
                          city : 'Bijapur',
                          state : 'karnataka',
                          pincode : 591115
                        },
               hobbies : ['coding','bird watching','singing']         
              }
    console.log('JavaScript person Object', person)
    const jsonObject = JSON.stringify(person)
    console.log('JSON person object',jsonObject)
    const javaScriptPersonObject = JSON.parse(jsonObject)    
    console.log('JavaScript person Object ofter parse',javaScriptPersonObject)     
    
    localStorage.setItem('email','billgates@gmail.com')
    let emailID =localStorage.getItem('email')
    console.log('Email ID',emailID)
    localStorage.clear();
    