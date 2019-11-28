console.log('window object',window);
console.log('this keyword',this);
console.log(this===window)

// window.alert('welcome to javaScript class')
// alert('welcome to banglore and basavangudi')
//  let confirmDelete =confirm('are you sure want to delete')
//  console.log('conferm Delete',confirmDelete)

//  let  username = prompt('what is your name','Megha')
// console.log('user name',username)

const person ={
    firstName : 'alia',
    age: 26,
    lastName : 'kapoor',
    getName :function () {
        console.log('this keyword',this)
        return this.firstName + ' ' +this.lastName
        
    }
}
let fullName = person.getName()
console.log('full name:',fullName)