# generic

---

- [정의](##정의)
- [<>](##<>)
- [\<T\>extends](##\<T\>extends)
- [제네릭메서드활용하기](##제네릭메서드활용하기)

---

## 정의

- 변수의 **자료형이 여러개 일** 수 있고, 그 기능(**메서드)은 동일**한 경우

- **과거** 여러 타입을 대체하기 위해 **Object**를 사용할 수 있음

```java
public class ThreeDPrinter{

	private Object material;
	
	public void setMaterial(Object material) {
		this.material = material;
	}
	
	public Object getMaterial() {
		return material;
	}
}
//--------------------
ThreeDPrinter printer = new ThreeDPrinter();

Powder powder = new Powder();
printer.setMaterial(powder);

Powder p = (Powder)printer.getMaterial();

```

- 현재

```java
public class GenericPrinter<T> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString(){
		return material.toString();
	}
}

```

- 자료형 매개변수 T(type parameter) : 이 클래스를 사용하는 시점에 실제 사용할 자료형을 지정, static 변수는 사용할 수 없음

---

## <>

- 다이아몬드 연산자라 함
- ArrayList list = new ArrayList<>();  //다이아몬든 연산자 내부에서 자료형은 생략가능 함
- 제네릭에서 자료형 추론(자바 10부터)
  - ArrayList list = new ArrayList()  => var list = new ArrayList();

---

## \<T\>extends

### 상위 클래스의 필요성

- T 자료형의 범위를 제한 할 수 있음
- 상위 클래스에서 선언하거나 정의하는 메서드를 활용할 수 있음
- 상속을 받지 않는 경우 T는 Object로 변환되어 Object 클래스가 기본으로 제공하는 메서드만 사용가능

```java
public class Plastic extends Material{

	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다");
	}
	
	public String toString() {
		return "재료는 Plastic 입니다";
	}
}


public class GenericPrinter<T extends Material> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString(){
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}
```

---

## 제네릭메서드활용하기

### 정의

- 자료형 매개변수를 메서드의 매개변수나 반환 값으로 가지는 메서드는
- 자료형 매개 변수가 하나 이상인 경우도 있음
- 제네릭 클래스가 아니어도 내부에 제네릭 메서드는 구현하여 사용 할 수 있음
- public <자료형 매개 변수> 반환형 메서드 이름(자료형 매개변수.....) { }

```java
public class Point<T, V> {
	
	T x;
	V y;
	
	Point(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	public  T getX() {
			return x;
	}

	public V getY() {
		return y;
    }
}

//---------------
public class GenericMethod {

	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right =((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
	}
}
```

