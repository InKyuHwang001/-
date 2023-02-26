# 지향입문

---

- [인스턴스 생성과 힙 메모리](##인스턴스생성과힙메모리)
- [생성자](##생성자)

---

## 인스턴스 생성과 힙 메모리

### 인스턴스(instance)

- class는 객체의 **속성을 정의** 하고, **기능을 구현**해 놓은 상태
- 클래스 기반으로 생성된 객체(**인스턴스**)는 각각 **다른 멤버 변수 값**을 가지게 됨
- new 키워드를 사용하여 인스턴스 생성

### 힘 메모리

- **생성된 인스턴스**는 동적 메모리(**heap memory**) 에 **할당**됨
- C나 C++ 언어에서는 사용한 동적 메모리를 프로그래머가 해제 시켜야 함 ( free() 난 delete 이용)
- 자바에서 **Gabage Collector** 가 **주기 적**으로 사용하지 않늠 **메모리를 수거**
- **하나의 클래스**로 부터 **여러개의 인스턴스가 생성**되고 각각 **다른 메모리 주소**를 가지게 됨

### 용어 정리
- 객체 : 객체 지향 프로그램의 대상, 생성된 인스턴스
- 클래스 : 객체를 프로그래밍 하기위해 코드로 정의해 놓은 상태
- 인스턴스 : new 키워드를 사용하여 클래스를 메모리에 생성한 상태
- 멤버 변수 : 클래스의 속성, 특성
- 메서드 : 멤버 변수를 이용하여 클래스의 기능을 구현한 함수
- 참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수
- 참조 값 : 생성된 인스턴스의 메모리 주소 값

---

## 생성자

### 생성자

- 기본 문법

  ```java
  class CalculatorEx {
  	// 필드변수 선언
  	int a;
  	int b;
  
  	public CalculatorEx() { // 기본 생성자
  		// 필드변수 초기화
  		a = 10;
  		b = 20;
  	}
  
  	public CalculatorEx(int num1, int num2) { // 생성자 오버로딩
  		// 매개값 이용 필드변수 초기화
  		a = num1;
  		b = num2;
  	}
  
  	public void sum() { // 메소드
  		System.out.println("합계 : " + (a + b));
  	}
  }
  
  public class ConstructorEx04 {
  	public static void main(String[] args) {
  		CalculatorEx cc = new CalculatorEx();
  		cc.sum(); // 결과 : 30
  		CalculatorEx cc2 = new CalculatorEx(0, 10);
  		cc2.sum(); // 결과 : 10
  	}
  }
  [출처] [JAVA/자바] 생성자(Constructor)와 초기화|작성자 JOKER
  ```

  

### default constuctor

### 만들기

