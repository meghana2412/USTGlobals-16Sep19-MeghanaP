// let h1element = document.getElementById('demo');
// console.log('Element =',h1element)
// console.log('element text =',h1element.textContent)
// h1element.textContent = 'Good Evening'
// console.log('==============================')
// console.log('element text= ',h1element.textContent)
// let buttonelement = document.createElement('button')
// buttonelement.textContent = 'Click me!!!'
// console.log('button element', buttonelement)

// document.body.appendChild(buttonelement);

// let ulElement = document.createElement('ul')
// let li1Element = document.createElement('li')
// let li2Element = document.createElement('li')
// let li3Element = document.createElement('li')

// li1Element.textContent ='JAVA'
// li2Element.textContent = 'SQL'
// li3Element.textContent = 'JAVASCRIPT'

// ulElement.appendChild(li1Element)
// ulElement.appendChild(li2Element)
// ulElement.appendChild(li3Element)
// document.body.appendChild(ulElement)

// h1element.style.color ='red'
// li3Element.style.color ='blue'
// h1element.style.fontSize = '50px'

 function showMessage(){
     alert('Hi Hello Welcome!!!!!')
 }
  function changeColor(){
   let pElement = document.getElementById('mover') 
   pElement.style.color = 'green' 
  }
  function removeColor() {
      let pElement = document.getElementById('mover')
      pElement.style.color = 'black' 

  }
  function printHello() {
      console.log('key released')
  
  

      let userName =document.getElementById('username').value
      document.getElementById('showusername').textContent = userName;
  }
  let name = 'Meghana'
  let age =21
  let phoneno =9481335280
  console.log(`Name is ${name} Age is${age} Phone no is ${phoneno}`)
  console.log(`2 + 2 =${2+2}`)
  document.getElementById('b1').disabled =true