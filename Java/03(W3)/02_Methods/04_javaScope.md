# Java Scope

Java에서 변수는 변수가 생성된 영역 내에서만 액세스할 수 있다. 이를 **범위** 라고 한다.

## Method Scope

**메서드 내에서 직접 선언된 변수**는 변수가 선언된 코드 줄 다음 메서드의 모든 위치에서 사용할 수 있다.

```java
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use int x

    int x = 100;
    // Code here can use int x
    System.out.println(x);
  }
}
```
## Block Scope

**코드 블록 내에서 선언된 변수**는 변수가 선언된 줄 다음에 나오는 중괄호 사이의 코드에서만 액세스할 수 있다.

```java
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use int x

    { // This is a block

      // Code here CANNOT use int x

      int x = 100;

      // Code here CAN use int x
      System.out.println(x);

   } // The block ends here

  // Code here CANNOT use int x

  }
}
```