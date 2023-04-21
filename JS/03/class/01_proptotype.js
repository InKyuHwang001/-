//1단계

//const fruit = ['Apple', 'Banana', 'Orange']
const fruit = new Array('Apple', 'Banana', 'Orange');

fruit.prototype.hwang = function(){
    console.log(this);
}

fruit.hwang()

const hwang = {
    firstName: 'InGyu',
    lastName: 'Hwang',

    getFullName(){
        return `${this.firstName} ${this.lastName}`
    }
}

const wang = {
    firstName: 'InGyu',
    lastName: 'Hwang'
}

console.log(hwang.getFullName())
console.log(wang.getFullName().call(hwang))

//2단계

function User(first, last){
    this.firstName = first;
    this.lastName = last;
}

User.prototype.getFullName = function(){
    return `${this.firstName} ${this.lastName}`;
}

const hwangNew = new User('InGyu', 'Hwang');

//3단계 Class

class User{
    constructor(first, last){
        this.firstName = first;
        this.lastName = last;
    }
    
    getFullName = function(){
        return `${this.firstName} ${this.lastName}`;
    }
}

const hwangNew2 = new User('InGyu', 'hwang');
hwangNew2.getFullName();