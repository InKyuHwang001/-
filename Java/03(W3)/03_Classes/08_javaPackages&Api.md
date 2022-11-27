# Java Packages & API

## Java Packages

Java의 패키지는 관련 클래스를 그룹화하는 데 사용한다. **파일 디렉토리의 폴더** 라고 생각하자.패키지를 사용하여 이름 충돌을 피하고 더 나은 유지 관리 가능한 코드를 작성할 수 있다.

- 내장 패키지(Java API의 패키지)
- 사용자 정의 패키지(자신만의 패키지 생성)

### Built-in Packages

Java API는 Java 개발 환경에 포함된 무료로 사용할 수 있는 미리 작성된 클래스 라이브러리이다.

**라이브러리는 패키지** 와 **클래스** 로나뉜다. 즉, 단일 클래스(메소드 및 특성과 함께)를 가져오거나 지정된 패키지에 속하는 모든 클래스를 포함하는 전체 패키지를 가져올 수 있다.

```java
import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package
```

### Import a Class

```java
import java.util.Scanner;
```

`java.util`은 패키지이고  `Scanner`는 클래스이다.

```java
import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}
```

## Import a Package

전체 패키지를 가져오려면 별표 기호(*)로 문장을 끝낸다.

```java
import java.util.*;
```

### User-defined Packages

```
└── root
  └── mypack
    └── MyPackageClass.java
```

```java
package mypack;
class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}
```
