# Java Methods

**메서드**는 호출될 때만 사용되는 코드 블럭이다. 함수와 유사하다.

메서드는 **재사용성이 높아**서 사용된다.

## Create a Method

메서드는 클래스 안에서 선언

메서드 이름 뒤에는 ()가 와야됨 

**System.out.println()**가 대표적인 미리 선언된 메서드임

```java
public class Main {
  static void myMethod() {
    // code to be executed
  }
}
```

**static**: Main이란 클래스에 속하는 메서드라는 것을 의미한다.

**void**: 이 메서드가 return value를 가지지 않는 다는 것을 의미한다.

## Call a Method

```java
public class Main {
  static void myMethod() {
    System.out.println("집에 가고 싶다!");
  }

  public static void main(String[] args) {
    myMethod();
    myMethod();
    myMethod();
  }
}

// 집에 가고 싶다!
// 집에 가고 싶다!
// 집에 가고 싶다!
```
