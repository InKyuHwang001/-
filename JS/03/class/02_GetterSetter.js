//Getter, Setter

class UserWrong{
    constructor(first, last){
        this.firstName = first;
        this.lastName = last;
        this.getFullName = `${this.first} ${this.last}`
    }
}

const hwang = new UserWrong('InGyu', 'hwang');
console.log(hwang);

hwang.firstName = 'Kim';
console.log(hwang);
//fullName이 변하지 않는 문제가 발생함

class User{
    constructor(first, last){
        this.firstName = first;
        this.lastName = last;
    
    }
    
    get fullName(){
        console.log('haha');
        return `${this.firstName} ${this.lastName}`;
    }

    set fullName(value){
        console.log(value);
        [this.firstName, this.lastName] = value.split(' ');
    }

}

const hwang = new User('InGyu', 'hwang');
console.log(hwang);

hwang.firstName = 'Kim';
console.log(hwang); //성이 김으로 변경됨

hwang.fullName = 'Hwang InSue'
console.log(hwang) // 황인수가 출력