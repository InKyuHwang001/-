# Stack
---

- [정의](##정의)
- [선언](##선언)
- [메서드](##메서드)

---

## 정의

- 맨 마지막 위치(top)에서만 자료를 추가,삭제, 꺼내올 수 있음 ( 중간의 자료를 꺼낼 수 없음)
- Last In First Out ( 후입선출 ) 구조

---

## 선언

```java
Stack st = new Stack(); // 타입 설정x Object로 선언
Stack<StackDemo> demo = new Stack<StackDemo>(); // class타입으로 선언
Stack<Integer> i = new Stack<Integer>(); // Integer타입 선언
Stack<Integer> i2 = new Stack<>(); // 뒤의 타입 생략 가능
		
Stack<String> s = new Stack<String>(); // String타입 선언
Stack<Character> ch = new Stack<Character>(); // Char타입 선언
```

---

## 메서드

- .push()
- .pop()
- .clear()
- .size()
- .firstElement()
- .lastElement()
- .peek()
- .get()
- .indexOf()
- .contains()
