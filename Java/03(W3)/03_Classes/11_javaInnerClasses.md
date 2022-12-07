# Java Inner Classes
## Java Inner Classes
중첨 클래스는  함께 속한 **클래스를 그룹화**하여 코드를 더 **읽기 쉽고 유지 관리**하기 쉽게 만드는 것이다.

```java
class OuterClass{
    int x = 10;
    class InnerClass{
        int y = 5;
    }
}
public class Main {
    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();
        class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}

// Outputs 15 (5 + 10)
    }
}
```

## Private Inner Classes

내부 클래스는 `private`와 `protected`일 수 있다.

외부 클래스에서 내부 클래스에 접근하는 것을 원하지 않는 다면 `private`로 선언할 수 있다.

```java
class OuterClass {
  int x = 10;

  private class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}

//Main.java:13: error: OuterClass.InnerClass has private access in OuterClass
//    OuterClass.InnerClass myInner = myOuter.new InnerClass();
```

## Static Inner Classes

`static`을 사용하여 외부 클래스의 개체를 만들지 않고도 액세스할 수 있

```java
class OuterClass {
  int x = 10;

  static class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass.InnerClass myInner = new OuterClass.InnerClass();
    System.out.println(myInner.y);
  }
}

// Outputs 5
```

## Access Outer Class From Inner Class

내부 클래스는 외부 클래스의 특성과 메서드에 접근할 수 있다.

```java
class OuterClass {
  int x = 10;

  class InnerClass {
    public int myInnerMethod() {
      return x;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.myInnerMethod());
  }
}

// Outputs 10
```

