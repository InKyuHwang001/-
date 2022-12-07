# Java Enums
## Enums
**constants **(변하지 않는 수_eg: `final`)그룹을 나타내는 특수 클래스 이다. 
```java
enum Level {
  LOW,
  MEDIUM,
  HIGH
}

//Level myVar = Level.MEDIUM;
```

`Enum은 "enumerations"의 줄임말로 "구체적으로 나열됨"을 의미한다.`

## Enum inside a Class
```java
public class Main {
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar);
  }
}

//MEDIUM
```
## Enum in a Switch Statement
```java
enum Level {
  LOW,
  MEDIUM,
  HIGH
}

public class Main {
  public static void main(String[] args) {
    Level myVar = Level.MEDIUM;

    switch(myVar) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
         System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }
  }
}
```
## Loop Through an Enum
```java
for (Level myVar : Level.values()) {
  System.out.println(myVar);
}
//LOW
//MEDIUM
//HIGH
```
## 사용하는 이유: 

월 일, 일, 색상, 카드 덱 등과 같이 변경되지 않을 것으로 알고 있는 값이 있는 경우 사용