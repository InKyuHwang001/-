# Java Methods Parameters

## Parameters(매개변수) and Arguments(인수)

정보는 Parameter로 Method에 전달될 수/  **Parameter**는 메서드의 **변수**를 의미

`fname`이 Parameter이다. 

```java
public class Main {
  static void myMethod(String fname) {
    System.out.println(fname + " 집가자");
  }

  public static void main(String[] args) {
    myMethod("인규");
    myMethod("황인규");
    myMethod("규");
  }
}
//인규 집가자
//황인규 집가자
//규 집가자
```

## Multiple Parameters

```java
public class Main {
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myMethod("Liam", 5);
    myMethod("Jenny", 8);
    myMethod("Anja", 31);
  }
}

// Liam is 5
// Jenny is 8
// Anja is 31
```

## Return Values

`void`: 메서드가 값을 반환하지 않아야함을 의미

값을 반환하게 하려면 `int`, `char` 등을 `void` 대신 사용한다. 그리고 `return`을 넣어야 한다.

```java
public class Main {
  static int myMethod(int x) {
    return 5 + x;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(3));
  }
}
// Outputs 8 (5 + 3)
```

```java
public class Main {
  static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    int z = myMethod(5, 3);
    System.out.println(z);
  }
}
// Outputs 8 (5 + 3)
```

## A Method with If...Else

```java
public class Main {

  // Create a checkAge() method with an integer variable called age
  static void checkAge(int age) {

    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");

    } else {
      System.out.println("Access granted - You are old enough!");
    }

  }

  public static void main(String[] args) {
    checkAge(20); 
  }
}

// Outputs "Access granted - You are old enough!"
```



