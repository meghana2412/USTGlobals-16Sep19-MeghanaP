let myName :string = 'megha';

console.log(myName, typeof myName);

let age : number;

console.log(age,typeof age);

let mobileNumber = 9481335280;

console.log(mobileNumber, typeof mobileNumber);

let address;

address = "qspider"

address = 24

console.log(address, typeof address);

let calAge = function() : void{
    console.log("age is 21");
}
calAge()

class Person{
    constructor(public name : string, public age : number){

    }
}
let person1 = new Person("Megha ", 21);
console.log(person1);

class Student extends Person{
    constructor(name : string, age : number, public rollNO : number){
        super(name,age);
    }
    
}
let student1 = new Student("Pavan", 22, 62)
console.log(student1);