# Java Variables

- `String` - stores text, such as "Hello". String values are surrounded by double quotes
- `int` - stores integers (whole numbers), without decimals, such as 123 or -123
- `float` - stores floating point numbers, with decimals, such as 19.99 or -19.99
- `char` - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
- `boolean` - stores values with two states: true or false

## Declaring Variables

**Syntax**

`type variableName = value;`

```java
public class Main {
  public static void main(String[] args) {
    String name = "John";
	System.out.println(name);
  }
}
```

```java
public class Main {
  public static void main(String[] args) {
    int myNum = 15;
	System.out.println(myNum);
  }
}
```

```java
public class Main {
  public static void main(String[] args) {
    int myNum;
    myNum = 15;
    System.out.println(myNum);
  }
}
```

```java
public class Main {
  public static void main(String[] args) {
    int myNum = 15;
    myNum = 20;  // myNum is now 20
    System.out.println(myNum);
  }
}
```

### Final Variables

- **final, constant**는 변수를 변하지 못하게 하고 읽을 수 만 있도록 한다.

```java
public class Main {
  public static void main(String[] args) {
    final int myNum = 15;
    myNum = 20;  // will generate an error: cannot assign a value to a final variable
  }
}
```

### Other Types

```java
public class Main {
  public static void main(String[] args) {
    int myNum = 5;
    float myFloatNum = 5.99f;
    char myLetter = 'D';
    boolean myBool = true;
    String myText = "Hello";
  }
}
```

## Display Variables

```java
public class Main {
  public static void main(String[] args) {
    String name = "John";
	System.out.println("Hello " + name);
  }
}
```

```java
public class Main {
  public static void main(String[] args) {
    String firstName = "John ";
    String lastName = "Doe";
    String fullName = firstName + lastName;
    System.out.println(fullName);
  }
}
```

```java
public class Main {
  public static void main(String[] args) {
    int x = 5;
    int y = 6;
    System.out.println(x + y); // Print the value of x + y
  }
}
```

## Java Declare Multiple Variables

```java
public class Main {
  public static void main(String[] args) {
    int x = 5, y = 6, z = 50;
    System.out.println(x + y + z);
  }
}
```

```java
public class Main {
  public static void main(String[] args) {
    int x, y, z;
    x = y = z = 50;
    System.out.println(x + y + z);
  }
}
```

## Java Identifiers

- 모든 변수는 유니크한 이름으로 구별되어야 한다.

```java
public class Main {
  public static void main(String[] args) {
    // Good
    int minutesPerHour = 60;

    // OK, but not so easy to understand what m actually is
    int m = 60;
  }
}
```

이름의 규칙

- 문자, 숫자, 밑줄 및 달러 기호가 포함될 수 있다.
- 이름은 문자로 시작 
- 소문자로 시작. 공백은 X
- $, _로 시작할 수 있다.
- 예약어는 사용할 수 없다.
