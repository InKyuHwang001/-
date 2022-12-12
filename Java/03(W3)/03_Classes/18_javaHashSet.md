# Java HashSet
## Java HashSet

HashSet은 모든 항목이 유니한 항목 모음이다.

```java
// Import the HashSet class
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```

## Check If an Item Exists

```java
cars.contains("Mazda");
```

## Remove an Item

```java
cars.clear();
```

## HashSet Size

```java
cars.size();
```

