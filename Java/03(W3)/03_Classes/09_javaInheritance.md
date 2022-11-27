# Java Inheritance
## Java Inheritance (Subclass and Superclass)
Java에서는 한 클래스에서 다른 클래스로 특성과 메서드를 상속할 수 있다. "상속 개념"을 두 가지 범주로 그룹화한다.
- 하위 클래스 (자식) - 다른 클래스에서 상속되는 클래스
- 슈퍼클래스 (부모) - 상속되는 클래스

클래스에서 상속하려면 `extends` 키워드를 사용

```java
class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute
  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
```

## The final Keyword

다른 클래스가 클래스에서 상속되는 것을 원하지 않으면 다음 `final`키워드 를 사용

```java
//오류
final class Vehicle {
  ...
}

class Car extends Vehicle {
  ...
}
```