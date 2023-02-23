# 인터페이스

---

- [개요](##인터페시스 개요)
- [쓰는 이유](##쓰는 이유)
- [다형성 구현](##IF를 활용한 다형성 구현)
- [IF의 여러가지 요소](##IF의 여러가지 요소)
- [여러 인터페이스 구현, 상속](##여러 인터페이스 구현, 상속)
---
## 인터페이스 개요
### 정의

- 모든 메서드가 추상 메서드로 선언됨 (public abstract)
- 모든 변수가 상수로 선언됨 (public static final)

```java
interface 인터페이스 이름{
	public static final float pi = 3.14F;
  public void makeSomething();
}
```

### 정의 구현 
**Calc -> Calculator -> CompleteCalc**

```java
public interface Calc {
  double Pi = 3.14;
  int ERROR = -999999;
  
  int add(int num1, int num2);
  int times(int num1, int num2);
}
```

```java
public abstract class Calculator implements Calc {
  @Overide
  public int add(int num1, int num2) {
    return num1 + num2;
  }
}
```

```java
public class CompleteCalc extends Calculator {
	@Overide
  public int times(int num1, int num2) {
    return num1 * num2;
  }  
  
  punlic void showInfo(){
    System.out.println("끝")
  }
}
```

```java
public class CalculatorTest {
  public static void main(String[] args) {
    Calc calc = new CompleteCalc();
    int num1 = 10;
    int num2 = 2;
    
    calc.add(num1, num2);
    calc.times(num1, num2);
  }
}
```

### 인터페이스 구현과 형 변환

- IF를 구현한 클레스는 IF 형으로 선언한 변수로 형 변환 할 수 있음
  - Calc calc = new CompleteCalc();
- 형 변환되는 경우 IG에 선언된 메서드만을 사용가능 함
  - Calc는 add, times가 사용할 수 있고
  - CalculatorCalc형 변수에서는 add, times, showInfo를 사용할 수 있다.

---

## 쓰는 이유

### IF가 하는 일

- 기능을 **명시적**으로 선언
	- 프로그램이 제공하는 **명세**
	- 명세만 보고 구현한 클래스를 사용할 수 
- 어떤 객첵가 하나의 IF라는 것은 인터페이스가 제공하는 모든 메서드를 구현했다는 의미임
- **다형성**을 이룰수
---
## IF를 활용한 다형성 구현 

### IF와 다형성

- 예
  - Sorting: Bubble Sort, Quick Sort, Heap Sort

### Dao 구현하기

- DAO(data access object)를 여러 DB 제품이 지원될 수 있게 구현함

```java
@Getter
@Setter
public class UserInfo{
  private String userId;
  private String passwd;
  private String userName; 
}
```

```java
public interface UserInfoDao{
  void insertUserInfo(UserInfo userInfo);
  void updateUserInfo(UserInfo userInfo);
  void deleteUserInfo(UserInfo userInfo);
}
```

```java
public class UserInfoMySqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into MYSQL DB userId =" + userInfo.getUserId() );		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into MYSQL DB userId = " + userInfo.getUserId());		
	}

	@Override
	public void deleteUserInf(UserInfo userInfo) {
		System.out.println("delete from MYSQL DB userId = " + userInfo.getUserId());
		
	}

}
```

```java
public class UserInfoOracleDao implements UserInfoDao{

	public void insertUserInfo(UserInfo userInfo){
		System.out.println("insert into ORACLE DB userId =" + userInfo.getUserId() );
	}
	
	public void updateUserInfo(UserInfo userInfo){
		System.out.println("update into ORACLE DB userId = " + userInfo.getUserId());
	}
	
	public void deleteUserInf(UserInfo userInfo){
		System.out.println("delete from ORACLE DB userId = " + userInfo.getUserId());
	}
}
```

```java
public class UserInfoClient {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPasswd("!@#$%");
		userInfo.setUserName("이순신");
		
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")){
			userInfoDao = new UserInfoOracleDao();
		}
		else if(dbType.endsWith("MYSQL")){
			userInfoDao = new UserInfoMySqlDao();
		}
		else{
			System.out.println("db support error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInf(userInfo);
	}
}
```

---

## IF의 여러가지 요소

### 상수
- 모든 변수는 상수로 변환됨
	- public static final
```java
double Pi = 3.14;
int ERROR = -999999999;
```
### 추상메서드 
- 모든 선언된 메서드는 추상 메서드 public abstract
### 디폴트 메서드 (자바 8이후)
- 구현을 가지는 메서드, 인터페이스를 구현하는 클래스들에서 **공통으로 사용**할 수 있는 **기본 메서드**
- default 키워드 사용
```java
default void description() {
	System.out.println("정수 계산기를 구현합니다.");
	myMethod();
}
```
- 구현 하는 클래스에서 **재정의** 할 수 있음
```java
@Override
public void description() {
	System.out.println("CompleteCalc에서 재정의한 default 메서드");
	//super.description();
}
```
- 인터페이스를 구현한 클래스의 인스턴스가 생성 되어야 사용 가능함
### 정적 메서드 (자바 8이후)
- **인스턴스 생성과 상관 없이** 인터페이스 타입으로 사용할 수 있는 메서드
```java
static int total(int[] arr) {
	int total = 0;
		
	for(int i: arr) {
		total += i;
	}
	mystaticMethod();
	return total;
}
```
### private 메서드 (자바 9이후)
- 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음
- 인터페이스 **내부에서만** 사용하기 위해 구현하는 메서드
- **default** 메서드나 **static** 메서드에서 정의를 위해 **사용**

```java
private void myMethod() {
	System.out.println("private method");
}
	
private static void mystaticMethod() {
	System.out.println("private static method");
}
```
---

## 여러 인터페이스 구현, 상속

### 여러 인터페이스 구현

- **하나의 클래스**가 **여러 인터페이스**는 **구현** 할 수 있음

- **디폴트 메서드**가 **중복** 되는 경우는 구현 하는 클래스에서 **재정의** 하여야 함

- 여러 인터페이스를 구현한 클래스는 **인터페이스 타입으로 형 변환** 되는 경우 **해당 인터페이스**에 **선언된 메서드만** 사용 가능

```java
public interface Sell {

	void sell();	
}
```

```java
public interface Buy {

	void buy();
}
```

```java
public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");		
	}

	public void sayHello() {
		System.out.println("Hello");
	}
}
```

```java
public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.sayHello();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();

	}
}
```
### 디폴트 메서드가 중복 되는 경우
- 두 개의 인터페이스에서 중복되면 구현하는 클래스에서 반드시 **재정의**를 해야 함

```java
public interface Sell {

	void sell();
	
	default void order() {
		System.out.println("판매 주문");
	}
}
```
``` java
public interface Buy {

	void buy();

	default void order() {
		System.out.println("구매 주문");
	}
}
```
``` java
public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");		
	}

	public void sayHello() {
		System.out.println("Hello");
	}

	@Override
	public void order() {
		System.out.println("customer order");
	}

}
```
``` java
public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.sayHello();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
	
		buyer.order();
		seller.order();
	
	}
}
```

### IF 상속

- **extends** 키워드를 사용
- 인터페이스는 **다중 상속**이 가능하고 구현 코드의 상속이 아니므로 **타입 상속** 이라고 함

```java
public interface X {

	void x();
}
```

```java
public interface Y {

	void y();
}
```

```java
public interface MyInterface extends X, Y{

	void myMethod();
}
```

```java
public class MyClass implements MyInterface{

	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");		
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");		
	}
}
```

```java
public class MyClassTest {

	public static void main(String[] args) {

		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.x();
		
		
		Y yClass = mClass;
		yClass.y();
		
		MyClass iClass = mClass;
		iClass.x();
		iClass.y();
		iClass.myMethod();
	}

}
```

### 클래스 상속과 인터페이스 구현 함께 쓰기

- 클래스 상속과 인터페이스의 구현을 같이 사용하는 경우가 많음

```java
public class Shelf {

	 protected ArrayList<String> shelf;
	 
	 public Shelf() {
		 shelf = new ArrayList<String>();
	 }
	 
	 public ArrayList<String> getShelf(){
		 return shelf;
	 }
	 
	 public int getCount() {
		 return shelf.size();
	 }
	 
}
```

```java
public interface Queue {

	void enQueue(String title);
	String deQueue();
	
	int getSize();
}
```

```java
public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
```

```java
public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("태백산맥1");
		bookQueue.enQueue("태백산맥2");
		bookQueue.enQueue("태백산맥3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}
```