# Java Constructors

## Java Constructors

Java의 생성자는 개체를 초기화하는 데 사용되는 **특수 메서드다.** 생성자는 클래스의 객체가 생성될 때 호출된다. 개체 속성의 초기 값을 설정하는 데 사용할 수 있다.

```java
// Create a Main class
public class Main {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Main() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5
```

## Constructor Parameters

Constructors를 초기화 하는데 Parameter를 사용할 수 있다. 



`int y`라는 파라미터를 constructor에 더하는 예이다. 

```java
public class Main {
  int x;

  public Main(int y) {
    x = y;
  }

  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println(myObj.x);
  }
}

// Outputs 5
```

```java
public class Main {
  int modelYear;
  String modelName;

  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Main myCar = new Main(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

// Outputs 1969 Mustang
```

