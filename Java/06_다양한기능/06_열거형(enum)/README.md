

# 열거형(enum)

---

## 정의

- 상수형을 나타내는 데이터 타입

- 관련된 상수를 그룹으로 묶어서 사용할 때 유용 

```java
public enum Day{
  MONDAY,
  TUESDAY,
	WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY,
  SUNDAY
}


자바 열거형(enum)은 상수 값을 나타내는 데이터 타입입니다. 보통 서로 관련된 상수를 그룹으로 묶어서 사용할 때 유용하게 사용됩니다.

다음은 자바 열거형의 예시입니다.

java
Copy code
public enum Day {
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY,
  SUNDAY
}

public class Example {
  public static void main(String[] args) {
    Day today = Day.MONDAY;
    
    switch (today) {
      case MONDAY:
        System.out.println("Today is Monday");
        break;
      case TUESDAY:
        System.out.println("Today is Tuesday");
        break;
      // ... 
      default:
        System.out.println("Today is not a weekday");
    }
    
    String dayName = today.name();
    System.out.println("Today is " + dayName);
  }
}

```

값과 타입을 확인하기에 안정성이 높고 가독성과 안전성이 높다.

## 사용메서드

- 열거형 상수에서는 ==와 compareTo()사용가능 하다.

- name()
- ordinal()
- valueOf()
- values()