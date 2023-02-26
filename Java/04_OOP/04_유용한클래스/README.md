# 유용한 클래스 들

---

- [Object Class - 모든 클래스의 최상위 클래스](##ObjectClass-모든클래스의최상위클래스)
- [메서드 들](##메서드들)
- [String 클래스](##String클래스)
- [Class사용하기_미완](##Class사용하기)
---

## ObjectClass-모든클래스의최상위클래스
### java.lang 패키지
- 프로그래밍시 import 하지 않아도 자동으로 imort됨
- import.java.lang.*;
- 많이 사용하는 기본 클래스들이 속한 패키지
- String, Integer, System...

### 모든 클래스는 Object 클래스를 상속 받는다

- java.lang.Object 클래스
- 모든 클래스는 **Object에서 상속**받고, Object 클래스의 메서드 중 **일부는 재정의해서 사용할 수** 있음
- 컴파일러가 extends Object를 추가함
  class Student => class Student extends Object
### toString() 메서드
- 객체의 정보를 String으로 바꾸어서 사용할 때 쓰임
- String이나 Integer 클래스는 이미 재정의 되어 있음
- toString()메서드 재정의 예
```java
class Book{
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return title + "," + author;
	}
	
}

public class BookTest {

	public static void main(String[] args) {

		Book book = new Book("데미안", "헤르만 헤세");
		System.out.println(book);
	}
}
```
---
## 메서드들
### equals() 메서드
- 두 인스턴스의 **주소 값**을 비교하여 true/false를 반환
- 재정의 하여 두 인스턴스가 논리적으로 동일함의 여부를 구현함
- 인스턴스가 다르더라도 논리적으로 동일한 경우 true를 반환하도록 **재정의 할 수** 있음
	(같은 학번, 같은 사번, 같은 아이디의 회원...)
- 오버라이딩 할꺼면 hashCode()도 해야함
### hashCode() 메서드
- hashCode()는 인스턴스의 **저장 주소를 반환**함
- **힙메모리**에 **인스턴스가 저장**되는 방식이 hash 방식
- hash : 정보를 저장, 검색하는 자료구조
- 자료의 특정 값(키 값)에 대한 저장 위치를 반환해주는 해시 함수를 사용
  - Index = hash(key)
  - Index: 저장 위치 key: 객체 정보

- 두 인스턴스가 같다는 것은?
  두 인스턴스에 대한 equals()의 반환 값이 true 동일한 hashCode() 값을 반환
- 논리적으로 동일함을 위해 equals() 메서드를 재정의 하였다면 hashCode()메서드도 재정의 하여 동일한 hashCode 값이 반환되도록 한다

```java
public class Student {

	private int studentId;
	private String studentName;

	public Student(int studentId, String studentName)
	{
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public boolean equals(Object obj) {
		if( obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId )
				return true;
			else return false;
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
}
```

```java
public class EqualTest {

	public static void main(String[] args) {
		Student Lee = new Student(100, "Lee");
		Student Lee2 = Lee;
		Student Shun = new Student(100, "Lee");
		
		System.out.println(Lee == Shun);
		System.out.println(Lee.equals(Shun));
		
		System.out.println(Lee.hashCode());
		System.out.println(Shun.hashCode());
		
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));

	}
}
```

### clone() 메서드
- 객체의 원본을 복제하는데 사용하는 메서드
- 생성과정의 복잡한 과정을 반복하지 않고 복제 할 수 있음
- clone()메서드를 사용하면 객체의 **정보(멤버 변수 값등...)가 동일**한 또 다른 인스턴스가 생성되는 것이므로, 객체 지향 프로그램에서의 **정보 은닉, 객체 보호의 관점**에서 **위배**될 수 있음
- 해당 클래스의 clone() 메서드의 사용을 허용한다는 의미로 cloneable 인터페이스를 명시해 줌
```java
public class Student implements Cloneable{

    .......

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
```
```java
  Student Lee3 = (Student)Lee.clone();
	System.out.println(System.identityHashCode(Lee));
	System.out.println(System.identityHashCode(Lee3));
		
```

---

## String클래스

### String Class

- 선언하기

  ```java
  String str1 - new String("abc");
  String str2 = "abc";
  ```

- 힙 메모리에 인스턴스로 생성되는 경우와 상수 풀(constant pool)에 있는 주소를 참조하는 두 가지 방법

- 힙 메모리는 생성될때마다 다른 주소 값을 가지지만, 상수 풀의 문자열은 모두 같은 주소 값을 가짐

  ```java
  public class StringTest {
  
  	public static void main(String[] args) {
  		String str1 = new String("abc");
  		String str2 = new String("abc");
  		
  		System.out.println(str1 == str2);
  		
  		String str3 = "abc";
  		String str4 = "abc";
  		
  		System.out.println(str3 == str4);
  	}
  }
  ```

- 한번 생성된 String은 불변(immutable)

- String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성됨 ( 메모리 낭비가 발생할 수도 )

```java
public class StringTest2 {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(android);
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
	}
}
```

### StringBuilder, StringBuffer 활용하기

- 내부적으로 가변적인 char[]를 멤버 변수로 가짐
- 문자열을 여러번 연결하거나 변경할 때 사용하면 유용함
- 새로운 인스턴스를 생성하지 않고 char[] 를 변경함
- StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화(synchronization)을 보장
- 단인 쓰레드 프로그램에서는 StringBuilder 사용을 권장
- toString() 메서드로 String반환

```java
public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append("android");
		System.out.println(System.identityHashCode(buffer));
		
		java = buffer.toString();
	}
}
```

### text block 사용하기 (java 13)

- 문자열을 """ """ 사이에 이어서 만들 수 있음
- html, json 문자열을 만드는데 유용하게 사용할 수 있음

```java
public class StringTextBlock {

	public static void main(String[] args) {
		
		String strBlock = """
				This 
				is 
				text
				block
				test.""";
		System.out.println(strBlock);
		
		System.out.println(getBlockOfHtml());
		
	}
	
	public static String getBlockOfHtml() {
		    return """
		            <html>

		                <body>
		                    <span>example text</span>
		                </body>
		            </html>""";	
	}
}
```

---

## Class사용하기
