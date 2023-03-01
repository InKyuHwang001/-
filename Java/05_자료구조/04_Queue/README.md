# Queue
---

- [정의](##정의)
- [선언](##선언)
- [메서드](##메서드)

---

## 정의

- 맨 앞(front) 에서 자료를 꺼내거나 삭제하고, 맨 뒤(rear)에서 자료를 추가 함
- Fist In First Out (선입선출) 구조

---

## 선언

```java
Queue queue = new LinkedList(); // 타입 설정x Object로 입력
Queue<QueueDemo> demo = new LinkedList<QueueDemo>(); // 타입을 QueueDemo클래스로 설정
		
Queue<Integer> i = new LinkedList<Integer>(); // Integer타입으로 선언
Queue<Integer> i2 = new LinkedList<>(); // new부분 타입 생략 가능
Queue<Integer> i3 = new LinkedList<Integer>(Arrays.asList(1, 2, 3)); // 선언과 동시에 초기값 세팅
		
Queue<String> str = new LinkedList<String>(); // String타입 선언
Queue<Character> ch = new LinkedList<Character>(); // Character타입 선언
```

---

## 메서드

```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args)  {
		Queue<String> que = new LinkedList<String>();
		
		// 값 추가
		que.add("Hello");
		que.add("World");
		que.add("Hello");
		que.add("Hello");
		que.add("World");
		
		System.out.println(que); // 결과 출력 -> [Hello, World, Hello, Hello, World]
		
		que.poll(); // 맨 앞의 값 삭제

		System.out.println(que); // 결과 출력 -> [World, Hello, Hello, World]
		
		que.remove(); // 맨 앞의 값 삭제

		System.out.println(que); // 결과 출력 -> [Hello, Hello, World]

		que.remove("Hello"); // 해당하는 값 삭제

		System.out.println(que); // 결과 출력 -> [Hello, World]

		que.clear(); // Index의 값 삭제

		System.out.println(que); // 결과 출력 -> []
	}
}

//

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args)  {
		Queue<String> que = new LinkedList<String>();
		
		// 값 추가
		que.add("Hello");
		que.add("World");
		que.add("Hello");
		que.add("Hello");
		que.add("World");
		
		System.out.println("Queue의 크기 : " + que.size()); 
	}
}

//
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args)  {
		Queue<String> que = new LinkedList<String>();
		
		// 값 추가
		que.add("Hello");
		que.add("World");
		que.add("Hello");
		que.add("Hello");
		que.add("World");
		
		System.out.println("첫 번째 값 출력 : " + que.peek());
				
		/* Iterator 클래스를 사용하여 값 출력 */
		Iterator iter = que.iterator();
		
		while(iter.hasNext())
			System.out.print(iter.next() + " ");
	}
}
```

