
class Person{
    constructor(name,first,second,third){
        this.name = name;
        this.first = first;
        this.second = second;
    }
    sum(){
        return 'prototype: '+(this.first+this.second);
    }
}
// class PersonPlus extends Person{
//     avg(){
//         return (this.first+this.second)/2;
//     }
// }

var kim = new PersonPlus('kim',10,20); 
console.log(kim.avg())

//위 코드에 third를 추가 하고 싶을때
//super : 부모코드가 할수 있는 일은 부모 코드에게 시키고 하지 못하는 것은 자신이 하는 것


class PersonPlus extends Person{
    constructor(name, first, second, third){
        super(name, first, second);
        this.third=third;
    }
    sum(){
        return super.sum()+this.third;
    }
    avg(){
        return (this.first+this.second+this.third)/3;
    }
}

var kim = new PersonPlus('kim', 10, 20, 30);
console.log("kim.sum()", kim.sum());
console.log("kim.avg()", kim.avg());