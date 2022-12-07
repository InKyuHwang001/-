# Java Interface
## Interfaces
Java에서 추상홤를 달성하는 또 다른 방법 은 인터페이스를 사용하는 것이다.

인터페이스는 완벽한 **"추상 클래스"**로 빈 본문을 가지고 있다.

```java
// interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void run(); // interface method (does not have a body)
}
```

```java
// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

### 참고 사항 

- **추상 클래스** 와 마찬가지로 인터페이스 를 사용하여 객체를 생성 **할 수 없다.**
- 인터페이스 메서드에는 본문이 없다.
- 인터페이스 구현 시 모든 메서드를 재정의해야한다.
- 인터페이스 메서드:  `abstract` , `public`
- 인터페이스 속성: `public`, `static`, `final`

## Multiple Interfaces

```java
interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class Main {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}
```
