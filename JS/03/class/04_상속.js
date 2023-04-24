// 상속(Inheritance)

class Vehicle{
    constructor(acceleration = 1){ //아무런 값이 안들어오면 1할당
        this.speed = 0
        this.acceleration = acceleration
    }

    accelerate() {
        this.speed += this.acceleration
    }

    decelerate(){
        if (this.speed <= 0){
            console.log('정지');
            return
        }
        this.speed -= this.acceleration
    }
}

class Bicycle extends Vehicle {
    constructor(price = 100, acceleration) {
        super(acceleration)
        this.price = price
        this.wheel = 2
    }
}


class Car extends Bicycle {
    constructor(license, price, acceleration) {
        super(price, price, acceleration)
        this.license = license
        this.wheel = 4
    }

    accelerate() {
        if (!this.license) {
            console.error('무면허!!')
            return
        }
        this.speed += this.acceleration
        console.log('가속!', this.speed)
    }
}

class Boat extends Vehicle {
    constructor(price, acceleration) {
        super(acceleration)
        this.price = price
        this.motor = 1
    }
}

const carA = new Car(true, 7_000, 2);
const bicycle = new Bicycle(300);
console.log(bicycle);
console.log(bicycle instanceof Bicycle);
console.log(carA instanceof Bicycle);
console.log(carA instanceof Car);

//constructor, instanceof
class A {
    constructor() { }
}
class B extends A {
    constructor() {
        super()
    }
}
class C extends B {
    constructor() {
        super()
    }
}

const a = new A;
const b = new B;
const c = new C;

console.log(b instanceof A);
console.log(b instanceof B);
console.log(b instanceof C);

console.log(c.constructor === A); //false
console.log(c.constructor === B); //false
console.log(c.constructor === C); //true