# Java Strings

## Java Strings

```java
String greeting = "Hello";
```

### String Length 

```java
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());
```

### String Methods

```java
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());
```

### Finding a Character in a String

```java
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7
```

## String Concatenation

```java
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + " " + lastName);
```

```java
String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));
```

## Java Numbers and Strings

```java
int x = 10;
int y = 20;
int z = x + y;  // z will be 30 (an integer/number)
```

```java
String x = "10";
String y = "20";
String z = x + y;  // z will be 1020 (a String)
```

```java
String x = "10";
int y = 20;
String z = x + y;  // z will be 1020 (a String)
```

## Strings - Special Characters

```java
String txt = "We are the so-called "Vikings" from the north."; 에러 

String txt = "We are the so-called \"Vikings\" from the north.";
String txt = "It\'s alright.";
String txt = "The character \\ is called backslash.";
```



