# Java Abstraction
## Abstract Classes and Methods
데이터 **추상화**는 세부 정보를 숨기고 필수 정보만 표시하는 프로세스이다.  **추상화는 추상 클래스**와 **인터페이스**를 사용해서 달성할 수 있다.

 `abstract`는 클래스 및 메서드에 사용되는 비액세스 수정자이다.

- **추상 클래스:** 객체를 생성하는 데 사용할 수 없는 제한된 클래스이다(액세스하려면 다른 클래스에서 상속해야 함).

- **추상 메서드:** 추상 클래스에서만 사용할 수 있으며 본문이 없다. 본문은 하위 클래스(에서 상속됨)에서 제공된다.

```java
abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}
```

```java
Animal myObj = new Animal(); // will generate an error
```

```java
// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

### 추상 클래스와 메서드를 사용하는 이유와 시기는?

보안을 유지하려면 특정 세부 정보를 숨기고 개체의 중요한 세부 정보만 표시한다.

**참고:** 인터페이스를 사용하여 추상화를 수행할 수도 있다.
