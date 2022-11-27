# Java Modifiers

## Modifiers

`public`은 **액세스 한정자**이다. 즉, 클래스, 특성, 메서드 및 생성자의 액세스 수준을 설정하는 데 사용한다.

- **Access Modifiers**: 엑세스 수준을 제어
- **Non-Access Modifiers**: 액세스 수준을 제어하지 않지만 다른 기능을 제공

## Access Modifiers

### For classes

| Modifier  | Description                                                  | Try it                                                       |
| :-------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
| `public`  | 클래스는 다른 클래스에서 액세스할 수 있다.                   | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_mod_public) |
| *default* | 클래스는 동일한 패키지의 클래스에서만 액세스할 수 있다. Modifier를 지정하지 않을 때 사용된다. | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_mod_default) |

### For attributes, methods and constructors

| Modifier    | Description                                                  | Try it                                                       |
| :---------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
| `public`    | 모든 클래스에서 코드에 액세스할 수 있다.                     | [Try it »](https://www.w3schools.com/java/tryjava_multi.asp?filename=demo_mod_public2&multi=demo_mod_public2_multi) |
| `private`   | 코드는 선언된 클래스 내에서만 액세스할 수 있다.              | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_access_mod) |
| *default*   | 코드는 동일한 패키지에서만 액세스할 수 있다. Modifier를 지정하지 않을 때 사용된다. | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_mod_default2) |
| `protected` | 코드는 동일한 패키지 및 하위 클래스에서 액세스할 수 있다.    | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_mod_protected) |

## Non-Access Modifiers

### For classes

| Modifier   | Description                                                  | Try it                                                       |
| :--------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
| `final`    | 클래스는 다른 클래스에서 상속할 수 없다.                     | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_inherit_final) |
| `abstract` | 이 클래스는 객체를 생성하는 데 사용할 수 없습니다(추상 클래스에 액세스하려면 다른 클래스에서 상속해야 함). | [Try it »](https://www.w3schools.com/java/tryjava_multi.asp?filename=demo_mod_abstract&multi=demo_mod_abstract_multi) |

### For attributes and methods

| Modifier       | Description                                                  |
| :------------- | :----------------------------------------------------------- |
| `final`        | 특성 및 메서드는 재정의/수정할 수 없다.                      |
| `static`       | 속성과 메소드는 객체가 아닌 클래스에 속하느다.               |
| `abstract`     | 추상 클래스에서만 사용할 수 있으며 메서드에서만 사용할 수 있다. |
| `transient`    | Attributes and methods를 포함하는 개체를 직렬화할 때 특성 및 메서드를 건너뛴다. |
| `synchronized` | 메서드는 한 번에 하나의 스레드에서만 액세스할 수 있다.       |
| `volatile`     | 속성 값은 스레드 로컬로 캐시되지 않으며 항상 "메인 메모리"에서 읽는다. |

#### Final

기존 속성 값을 재정의하는 기능을 원하지 않으면 속성을 `final`을 사용한다.

```java
public class Main {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 50; // will generate an error: cannot assign a value to a final variable
    myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
```

#### Static

`public`과 달리  `static`메서드는 클래스의 객체를 생성하지 않고 접근할 수 있다.

```java
public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[ ] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would output an error

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method
  }
}
```

#### Abstract

추상 메서드는 추상 클래스에 속하며 본문이 없다. 본문은 하위 클래스에서 제공된다.

```java
// Code from filename: Main.java
// abstract classabstract class Main {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
// End code from filename: Main.java

// Code from filename: Second.java
class Second {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Main)
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method  }
}
```
