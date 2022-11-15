# Java Loop

## While Loop

```java
while (condition) {
  // code block to be executed
}
```

```java
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
```

### The Do/While Loop

- 일단 한번은 동작해야 하는 경우 사용하는 것이 좋다.

```java
do {
  // code block to be executed
}
while (condition);
```

```java
int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5);
```

## Java For Loop

### Java For Loop

```java
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
```

1번 자리는 루프가 돌기전에 실행

2번 자리는 지속되는 조건

3번 자리는 코드블럭이 실행후 시행

```java
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}

for (int i = 0; i <= 10; i = i + 2) {
  System.out.println(i);
}
```

### Java For-Each Loop

```java
for (type variableName : arrayName) {
  // code block to be executed
}
```

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
```



