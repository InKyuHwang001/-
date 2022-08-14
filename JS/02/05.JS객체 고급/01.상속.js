
class Person{
    constructor(name,first,second,third){
        this.name = name;
        this.first = first;
        this.second = second;
        this.third = third;
    }
    sum(){
        return 'prototype: '+(this.first+this.second);
    }
    // avg(){
    //     return (this.first+this.second)/2;
    // }
    //남이짠 코드거나 추가적으로 필요한 것인 경우 상속을 함
}

//avg를 상속말고도 클래스를 하나더 만들 수 도 있으나 너무 귀찮음

class PersonPlus extends Person{
    avg(){
        return (this.first+this.second)/2;
    }
}

var kim = new PersonPlus('kim',10,20); 
console.log(kim.avg())