# Java Classes and Objects

## Java Classes/Objects

자바는 객체 지향 프로그래밍 언어이다. 

##  Create a Class

```java
public class Main {
  int x = 5;
}
```

## Create an Object

Main이라는 클래스에서 오브젝트를 만들련면 클래스의 이름과 오브켁트이름 그리고 `new`를 입력해야한다.

```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
```

```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}
```

## Using Multiple Classes

```java
public class Main {
  int x = 5;
}
```

```java
class Second {
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```

```
C:\Users\Your Name>javac Main.java
C:\Users\Your Name>javac Second.java
```

```
C:\Users\Your Name>java Second
```

```
5
```

