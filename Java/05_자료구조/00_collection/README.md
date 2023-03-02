# Collection_Framework
---

- [정의](##정의)
- [List인터페이스](##List인터페이스)
- [Set인터페이스](##Set인터페이스)
- [Map인터페이스](##Map인터페이스)
- [Iterator](##Iterator)

---

## 정의

- java.util 패키지에 구현

## List인터페이스

- 객체를 **순서에 따라 저장**하고 관리하는데 필요한 메서드가 선언된 인터페이스
- 자료구조 리스트 (배열, 연결리스트)의 구현을 위한 인터페이스
- **중복을 허용**함
- ArrayList, Vector, LinkedList, Stack, Queue 등...

---

## Set인터페이스

- 순서와 관계없이 **중복을 허용하지 않고** **유일한 값**을 관리하는데 필요한 메서드가 선언됨
- 저장된 순서와 출력되는 **순서는 다를 수** 있음
- HashSet, TreeSet등...

---

## Map인터페이스

- 쌍(pair)로 이루어진 객체를 관리하는데 사용하는 메서드들이 선언된 인터페이스
- 객체는 **key-value의 쌍**으로 이루어짐
- key는 중복을 허용하지 않음
- HashTable, HashMap, Properties, TreeMap 등이 Map 인터페이스를 구현 함

---

## Iterator

- Set 인터페이스의 경우 get(i) 메서드가 제공되지 않으므로 Iterator를 활용하여 객체를 순회

```java
public boolean removeMember(int memberId){  // 멤버 아이디를 매개변수로, 삭제 여부를 반환
	
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면 
				arrayList.remove(member);           // 해당 멤버를 삭제
				return true;                   // true 반환
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
		return false;                   
}

```

