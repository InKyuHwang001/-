# 연결 리스트
- [정의](##정의)
- [선언](##선언)
- [메서드](##메서드)

---

## 정의

- 동일한 데이터 타입을 **순서에 따라** 관리하는 자료 구조
- 노드에는 자료와 다음 요소를 가리키는 링크(포인터)가 있음
- 자료가 추가 될때 노드 만큼의 메모리를 할당 받고 이전 노드의 링크로 연결함 (정해진 크기가 없음)
- i 번째 요소를 찾는게 걸리는 시간은 요소의 개수에 비례 : O(n)
- **자주 삽입 삭제**가 이루어지는 경우 용이 but **검색에는 느름**

---

## 선언

```java
LinkedList li = new LinkedList(); // 타입 설정x Object로 입력
LinkedList<LinkedListDemo> demo = new LinkedList<LinkedListDemo>(); // List타입을 LinkedListDemo
LinkedList<Integer> i = new LinkedList<Integer>(); // int 타입으로 선언
LinkedList<Integer> i2 = new LinkedList<>(); // 타입 선언 생략도 가능
LinkedList<Integer> i3 = new LinkedList<Integer>(Arrays.asList(1, 2, 3)); // 초기 값 세팅
		
LinkedList<String> s = new LinkedList<String>(); // String 타입 사용
LinkedList<Character> ch = new LinkedList<Character>(); // Char 타입 사용
```

---
## 메서드
```java
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args)  {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Hello");
		ll.add("Hello");
		ll.add(1, "World");
		
		System.out.println(ll);
		
		ll.set(1, "Hello");

		System.out.println(ll);
	}
}

//

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args)  {
		LinkedList<String> ll = new LinkedList<String>();
		
		/* 값을 추가한다 */
		ll.add("Hello");
		ll.add("World");
		ll.add("Hello");
		ll.add("World");
		ll.add("Hello");
		ll.add("World");
		
		System.out.println(ll);

		ll.removeFirst(); // 첫 번째 데이터 삭제
		ll.removeLast(); // 마지막 데이터 삭제

		System.out.println(ll);
		
		ll.remove(); // remove로 삭제하면 첫 번째 데이터를 삭제

		System.out.println(ll);

		ll.remove(2); // Index순번의 데이터를 삭제

		System.out.println(ll);

		ll.clear(); // List의 모든 데이터를 삭제
		
		System.out.println(ll);
	}
}
//
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args)  {
		LinkedList<String> ll = new LinkedList<String>();
		
		/* 값을 추가한다 */
		ll.add("Hello");
		ll.add("World");
		ll.add("Hello");
		ll.add("World");
		
		System.out.println(ll);
		System.out.print(ll.size());
	}
}

//
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args)  {
		LinkedList<String> ll = new LinkedList<String>();
		
		/* 값을 추가한다 */
		ll.add("Hello");
		ll.add("World");
		ll.add("Hello");
		ll.add("World");
		
		/* get(i) 메서드를 사용하여 값 출력 */
		for(int i = 0; i < ll.size(); i++)
			System.out.print(ll.get(i) + " ");
		
		System.out.println();

		/* 향상된for문을 사용하여 값 출력 */
		for(String str : ll)
			System.out.print(str + " ");
		
		System.out.println();

		/* Iterator를 사용하여 값 출력 */
		Iterator iter = ll.iterator();
		while(iter.hasNext())
			System.out.print(iter.next() + " ");
	}
}

//
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args)  {
		LinkedList<String> ll = new LinkedList<String>();
		
		/* 값을 추가한다 */
		ll.add("Hello");
		ll.add("World");
		ll.add("Hello");
		ll.add("World");
		
		System.out.println("값 검색(contains) : " + ll.contains("Hello"));
		System.out.println("값 검색(IndexOf) : " + ll.indexOf("Hello"));
	}
}
```
