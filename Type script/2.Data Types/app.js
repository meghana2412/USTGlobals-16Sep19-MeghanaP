var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myName = 'megha';
console.log(myName, typeof myName);
var age;
console.log(age, typeof age);
var mobileNumber = 9481335280;
console.log(mobileNumber, typeof mobileNumber);
var address;
address = "qspider";
address = 24;
console.log(address, typeof address);
var calAge = function () {
    console.log("age is 21");
};
calAge();
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    return Person;
}());
var person1 = new Person("Megha ", 21);
console.log(person1);
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(name, age, rollNO) {
        var _this = _super.call(this, name, age) || this;
        _this.rollNO = rollNO;
        return _this;
    }
    return Student;
}(Person));
var student1 = new Student("Pavan", 22, 62);
console.log(student1);
