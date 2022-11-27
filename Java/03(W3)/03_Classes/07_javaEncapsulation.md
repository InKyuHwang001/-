# Java Encapsulation

## Encapsulation

**캡슐화** 의 의미는 "민감한" 데이터가 사용자에게 숨겨지는지 확인하는 것입니다. 이를 달성하려면

-  variables/attributes로 `private`으로 선언한다.

- private variable 값에 액세스하고 업데이트하는 공개 get 및 set 메소드 제공

## Get and Set

Private variables는 동일한 클래스 내에서만 액세스할 수 있다(외부 클래스는 액세스할 수 없음). 그러나 public get 및 set 메서드를 제공하면 액세스가 가능하다.

```java
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}
```

## 왜 캡슐화 하는가?

- 클래스 속성 및 메서드 제어 향상
- 클래스 속성은 **읽기 전용(get)**과 **쓰기 전용(set)**으로 만들 수 있다.
- 데이터 보안성 강화
- 유연성: 다른 부분에 영향을 주지 않고 코드의 한부분을 변경할 수 있다.

