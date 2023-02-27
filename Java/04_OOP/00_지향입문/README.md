# 지향입문

---

- [인스턴스 생성과 힙 메모리](##인스턴스생성과힙메모리)
- [생성자](##생성자)
- [오버로딩](##오버로딩)
- [참조자료형](##참조자료형)
- [접근제어자,정보은닉](##접근제어자,정보은닉)
- [캡슐화](##캡슐화)
- [this](##this)
- [여러 인스턴스에서 고통으로 사용 변수를 선언하자 - static변수](##static변수)
- [static메서드](##static메서드)

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
  public class Person {
      private String name;
      private int age;
  
      // 인자를 받는 생성자
      public Person(String name, int age) {
          this.name = name;
          this.age = age;
      }
  
      // 기본 생성자
      public Person() {
          
      }
  }
  ```
  
- 객체를 생성할 때 new 키워드와 함께 사용   - **new Student();**

- 생성자는 일반 함수처럼 기능을 호출하는 것이 아니고 객체를 생성하기 위해 new 와 함께 호출 됨

- 객체가 생성될 때 **변수나 상수를 초기화** 하거나 다른 초기화 기능을 수행하는 메서드를 호출 함

- 생성자는 반환 값이 없고, 클래스의 이름과 동일

- **대부분**의 생성자는 **외부에서 접근 가능**하지만, 필요에 의해 private 으로 선언되는 경우도 있음

### default constuctor

- public Person(){}
  - 매개 변수 없음, 구현부가 없음

---

## 오버로딩

### 생성자 정의 하기

- 생성자를 구현해서 사용할 수 있음
- 클래스에 생성자를 따로 구현하면 기본 생성자 (default constructor)는 제공되지 않음
- 생성자를 호출하는 코드(client 코드)에서 여러 생성자 중 필요에 따라 호출해서 사용할 수 있음

```java
public class UserInfo {

	public String userId;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	public UserInfo(){}
	
	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	
	public String showUserInfo() {
		return "고객님의 아이디는 " + userId + "이고, 등록된 이름은 " + userName + "입니다."; 
	}
}
```

```java
public class UserInfoTest {

	public static void main(String[] args) {

		UserInfo userLee = new UserInfo();
		userLee.userId = "a12345";
		userLee.userPassWord = "zxcvbn12345";
		userLee.userName = "Lee";
		userLee.phoneNumber = "01034556699";
		userLee.userAddress = "Seoul, Korea";
		
		System.out.println(userLee.showUserInfo());
		
		UserInfo userKim = new UserInfo("b12345", "09876mnbvc", "Kim");
		System.out.println(userKim.showUserInfo());
	}
}
```

---

## 참조자료형

### 참조 자료형

- 변수의 자료형
  - 기본 자료형: int, long, float, double 등
  - 참조 자료형: String, Date, Person 등
- 클래스형으로 변수 선언
- **기본 자료형**은 사용하는 **메모리의 크기**가 **정해져** 있지만, **참조 자료형**은 클래스에 따라 **다름**
- 참조 자료형을 **사용 할때**는 해당 **변수에 대해 생성**하여야 함  
   (**String** 클래스는 **예외적**으로 생성하지 않고 사용할 수 있음)

```java
public class Student {
	
	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentSocre() {
		int total = korea.score + math.score;
		System.out.println(studentName +  " 학생의 총점은 " + total + "점 입니다." );
		
	}
}

public class Subject {
	String subjectName;
	int score;
	int subjectID;
}

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 95);
		
		
		Student studentKim = new Student(101, "Kim");
		studentKim.setKoreaSubject("국어", 80);
		studentKim.setMathSubject("수학", 99);
		
		studentLee.showStudentSocre();
		studentKim.showStudentSocre();
	}

}
```

---

## 접근제어자,정보은닉

### 접근 제어 지시자 (accesss modifier)

- 클래스 외부에서 클래스의 멤버 변수, 메서드, 생성자를 사용할 수 있는지 여부를 지정하는 키워드
- private : 같은 클래스 내부에서만 접근 가능 ( 외부 클래스, 상속 관계의 클래스에서도 접근 불가)
- 아무것도 없음 (default) : 같은 패키지 내부에서만 접근 가능 ( 상속 관계라도 패키지가 다르면 접근 불가)
- protected : 같은 패키지나 상속관계의 클래스에서 접근 가능하고 그 외 외부에서는 접근 할 수 없음
- public : 클래스의 외부 어디서나 접근 할 수 있음

### 정보 은닉

- public으로 공개되었을 때보다 private 일때 각 변수에 대한 제한을 public 메서드에서 제어 할 수 있다.

```java
public void setMonth(int month) {
		
		if ( month < 1 || month > 12) {
			isValid = false;
		}
		else {
			this.month = month;
		}
	}

```

- 정보 은닉은 필요한 외부에서 접근 가능한 **최소한의 정보를 오픈 **함으로써 객체의  **오류를 방지 **하여 클라이언트 객체가 더 효율적으로 객체를 활용할 수 있도록

---

## 캡슐화

### 정보 은닉을 활용한 캡슐화

- 꼭 필요한 정보와 기능만 외부에 오픈함
- 대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만은 제공하여 일관된 기능을 구현 하게 함
- 각각의 메서드나 멤버 변수를 접근함으로써 발생하는 오류를 최소화 한다.

---

## this

### this가 하는 일

- **인스턴스 자신의 메모리**를 가리킴
- 생성자에서 또 **다른 생성자를 호출 시**
- 자신의 주소(**참조값)을 반환**

### 생성자에서 다른 생성자를 호출 하는 this

- 클래스에 **생성자가 여러 개 인경우,** this를 이용하여 생성자에서 다른 생성자를 호출할 수 있음
- 생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 **완전하지 않은 상태**이므로 **this() statement 이전에 다른 statement를 쓸 수 없음**

```java
public class Person {

	String name;
	int age;
	
  //뒤의 생성자가 먼저 생성된 후
	public Person() {
    //코드 입력 불가능 
		this("이름없음", 1);
    //코드 사용 가능
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
```

### 자신의 주소를 반환하는 this

```java
public class Person {

	String name;
	int age;
	
	public Person() {
		this("이름없음", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person getPerson() {
		return this; //이 부분 임
	}
	
	
	public static void main(String[] args)
	{
		Person p = new Person();
		p.name = "James";
		p.age = 37;
		
		Person p2 = p.getPerson();
		System.out.println(p);
		System.out.println(p2);
	}
}
```
---
## static변수

### 공통으로 사용하는 변수가 필요한 경우

- 여러 인스턴스가 **공유하는 기준 값**이 필요한 경우
  - 카드회사 카드번호 부여시

### static 변수 선언과 사용하기

- 인스턴스가 생성될 때 만들어지는 변수가 아닌, 처음 프로그램이 **메모리에 로딩될 때 메모리를 할당**

- 클래스 변수, 정적변수라고도 함

---

## static메서드

### 만들기

```java
private static int serialNum = 1000;

 ...
public static int getSerialNum() {
	return serialNum;
}

public static void setSerialNum(int serialNum) {
	Employee.serialNum = serialNum;
}
```

### static 메서드(클래스 메서드)에서는 인스턴스 변수를 사용할 수 없다

- static 메서드는 **인스턴스 생성과 무관**하게 클래스 이름으로 **호출 될 수** 있음
- 인스턴스 생성 전에 호출 될 수 있으므로 static 메서드 내부에서는 인스턴스 변수를 사용할 수 없음

### 변수의 유효 범위와 메모리

- static 변수는 프로그램이 **메모리에 있는 동안 계속 그 영역을 차지**하므로 너무 큰 메모리를 할당하는 것은 좋지 않음
- 클래스 내부의 여러 메서드에서 사용하는 변수는 멤버 변수로 선언하는 것이 좋음
- 멤버 변수가 너무 많으면 인스턴스 생성 시 쓸데없는 메모리가 할당됨

| 변수                | 선언 위치                               | 사용범위                                                    |  메모리  |  생성과 소멸   |
| :------------------ | -------------------------- | ---------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| 지역 변수           | 함수 내부                               | 함수 내부                                                   | 스택 | **함수가 호출될** 때 **생성 함수가 끝나면** 소멸 |
| 멤버(인스턴스) 변수 | 클래스 멤버 변수로 선언                 | 클래스 내부에서 사용, 다른 클래스에서 사용 가능             | 힙 | **인스턴스가 생성될 때** **힙**에 생성되고, **가비지 컬렉터**가 메모리 수거시 소멸 |
| Static(class) 변수  | Static 예약어를 사용 클래스 내부에 선언 | 클래스 내부에서 사용, 클래스 이름으로 다른 클래스 사용 가능 | 데이터 영역 | **프로그램이 처음 시작할 때** 상수와 함께 **데이터 영역**에 생성되고 프로그램이 끝나고 **메모리를 해제**할 때 소멸 |