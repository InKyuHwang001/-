# Java Recursion

재귀는 함수 자기자신을 호출하는 기술이다.  

## Example

```java
public class Main {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}
```
## Halting Condition(정지 조건)

모든 재귀 함수에는 함수가 자신을 호출하는 것을 중지하는 조건인 정지 조건이 있어야한다.

```java
public class Main {
  public static void main(String[] args) {
    int result = sum(5, 10);
    System.out.println(result);
  }
  public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }
}
```