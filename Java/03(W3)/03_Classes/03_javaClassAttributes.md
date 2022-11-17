# Java Class Attributes

## Java Class Attributes

클래스의 **Attribute**는 

```java
public class Main {
  int x = 5;
  int y = 3;
}
```

## Accessing Attributes

클래스의 객체를 생성하고 점 구문( `.`)을 사용하여 속성에 액세스할 수

```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```

## Modify Attributes

```java
public class Main {
  int x;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}
```

오버라이딩을 통해서도 가능하다.

```java
public class Main {
  int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
}
```

만약 값을 오버라이딩 하길 원치 않는다면 `final`로 선언하면 된다.

```java
public class Main {
  final int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
```
