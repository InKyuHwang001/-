# 람다식

---

- [람다식](##람다식)
- [함수형인터페이스와람다식](##함수형인터페이스와람다식)
- [Stream](##Stream)

---

## 람다식

### 함수형 프로그래밍과 람다식

- 자바8 부터 함수형 프로그래밍 방식을 지원
- 함수형 프로그래밍은 **순수함수**(pure function)를 구현하고 호출함으로써 **외부 자료에 부수적인 영향(side effect)를 주지 않도록 구현**하는 방식
  - **순수 함수**란 **매개변수만을 사용**하여 만드는 함수 
  - 함수 내부에서 함수 외부에 있는 변수를 사용하지 않아 **함수가 수행되더라도 외부에는 영향을 주지 않는**다.

- 입력받는 자료 이외에 외부 자료를 사용하지 않아 **여려 자료가 동시에 수행되는 병렬처리가 가능**

- 함수의 기능이 자료에 독립적임을 보장
  - 동일한 자료에 대해 동일한 결과를 보장하고, 다양한 자료에 대해 같은 기능을 수행

### 문법

- 매개 변수와 매개변수를 이용한 실행문 (매개변수) -> {실행문;}

```java
(int x, int y) -> {return x+y;}
str->{System.out.println(str);}
str-> System.out.println(str);
(x, y) -> x+y;
str -> str.length;
```

---

## 함수형인터페이스와람다식

### 함수형 인터페이스 선언하기

- 람다식을 선언하기 위한 인터페이스

- 익명 함수와 매개 변수만으로 구현되므로 인터페이스는 단 하나의 메서드만을 선언해야함

- @FunctionalInterface 애노테이션(annotation)

  함수형 인터페이스라는 의미, 내부에 여러 개의 메서드를 선언하면 에러남

---

## Stream

### 정의

- 스트림은 '데이터의 흐름’이다.
  - 배열과 컬렉션을 함수형으로 처리할 수 있다.
- 간단하게 병렬처리(*multi-threading*)가 가능하다.
  - 쓰레드를 이용해 많은 요소들을 빠르게 처리할 수 있다.

### 생성 및 사용

```java
public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		int sumVal = Arrays.stream(arr).sum();
		long count = Arrays.stream(arr).count();
		
		System.out.println(sumVal);
		System.out.println(count);
	}

}
```

### 중간 연산과 최종 연산

#### 중간연산

- 중간 연산의 예 - filter(), map(), sorted() 등

  조건에 맞는 요소를 추출(filter)하거나 요소를 변환 함(map)

- 최종 연산이 호출될 때 중간 연산이 수행되고 결과가 생성 됨

#### 최종연산

- 최종 연산의 예 - forEach(), count(), sum() 등

  스트림이 관리하는 자료를 하나씩 소모해가며 연산이 수행 됨

  최종 연산 후에 스트림은 더 이상 다른 연산을 적용할 수 없음

  forEach() : 요소를 하나씩 꺼내 옴

  count() : 요소의 개수

  sum() : 요소들의 합

#### 예

- 문자열 리스트에서 문자열의 길이가 5 이상인 요소만 출력하기

```java
  sList.stream().filter(s->s.length() >= 5).forEach(s->System.out.println(s));
```

filter()는 중간 연산이고, forEach()는 최종 연산임

- 고객 클래스 배열에서 고객 이름만 가져오기

```java
  customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
```

map()은 중간 연산이고, forEach()는 최종 연산임

- 중간 연산과 최종 연산에 대한 구현은 람다식을 활용함
