# Java Data Types

## Java Data Types

```java
int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String
```

### Primitive Data Types

| Data Type | Size    | Description                                                  |
| :-------- | :------ | :----------------------------------------------------------- |
| `byte`    | 1 byte  | Stores whole numbers from -128 to 127                        |
| `short`   | 2 bytes | Stores whole numbers from -32,768 to 32,767                  |
| `int`     | 4 bytes | Stores whole numbers from -2,147,483,648 to 2,147,483,647    |
| `long`    | 8 bytes | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| `float`   | 4 bytes | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits |
| `double`  | 8 bytes | Stores fractional numbers. Sufficient for storing 15 decimal digits |
| `boolean` | 1 bit   | Stores true or false values                                  |
| `char`    | 2 bytes | Stores a single character/letter or ASCII values             |

## Java Numbers

**Integer types**은 byte, short, int 그리고  long 순이다.

**Floating point types**은 float, double이다.

- 가장 자주 사용되는 타입은 int와 double이다.

## Java Boolean Data Types

Boolean은 참/거짓 On/ Off Yes/No 를 나타내는 타입으로  true, false값을 받는다.

## Java Characters

### Characters

The `char` data type is used to store a **single** character.

```javascript
char myGrade = 'B';
System.out.println(myGrade)
```

### Strings

The `String` data type is used to store a sequence of characters (text).

```java
String greeting = "Hello World";
System.out.println(greeting);
```

## Java Non-Primitive Data Types

Non-Primitive Data Types은 reference Type이라고도 불린다.

- 기본데이터 유형은 이미 정의 되어 있으나 Non-Primitive Data Type은 자바에 의해 정의되지 않는다(String 제외)

- Non-Primitive Data Type은 특정 작업을 수행하기위해 메소드를 호출하는데 사용가능하다 기본데이터 타입은 불가능하다.
- 기본데이터 타입은 항상 값을 가지나 Non-Primitive Data Type은 null이 될 수 있다. 
- Non-Primitive Data Type은 대문자로 시작하고 기본데이터 타입은 소문자로 시작한다.
- Non-Primitive Data Type은 항상 같은 사이즈이나 기본데이터는 데이터 타입에 따라 사이즈가 다르다.
