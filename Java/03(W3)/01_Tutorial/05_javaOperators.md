# Java Operators

## Java Operators

Operators are used to perform operations on variables and values.

```java
int sum1 = 100 + 50;        // 150 (100 + 50)
int sum2 = sum1 + 250;      // 400 (150 + 250)
int sum3 = sum2 + sum2;     // 800 (400 + 400)
```

Operators 종류

- Arithmetic operators
- Assignment operators
- Comparison operators
- Logical operators
- Bitwise operators

## Arithmetic Operators

수학적 계산을 하기 위한 Operators

| Operator | Name           | Description                            | Example | Try it                                                       |
| :------- | :------------- | :------------------------------------- | :------ | :----------------------------------------------------------- |
| +        | Addition       | Adds together two values               | x + y   | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_add) |
| -        | Subtraction    | Subtracts one value from another       | x - y   | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_sub) |
| *        | Multiplication | Multiplies two values                  | x * y   | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_mult) |
| /        | Division       | Divides one value by another           | x / y   | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_div) |
| %        | Modulus        | Returns the division remainder         | x % y   | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_mod) |
| ++       | Increment      | Increases the value of a variable by 1 | ++x     | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_inc) |
| --       | Decrement      | Decreases the value of a variable by 1 | --x     | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_dec) |

## Java Assignment Operators

| Operator | Example | Same As    | Try it                                                       |
| :------- | :------ | :--------- | :----------------------------------------------------------- |
| =        | x = 5   | x = 5      | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_ass1) |
| +=       | x += 3  | x = x + 3  | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_ass2) |
| -=       | x -= 3  | x = x - 3  | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_ass3) |
| *=       | x *= 3  | x = x * 3  | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_ass4) |
| /=       | x /= 3  | x = x / 3  | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_ass5) |
| %=       | x %= 3  | x = x % 3  | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_ass6) |
| &=       | x &= 3  | x = x & 3  | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_ass7) |
| \|=      | x \|= 3 | x = x \| 3 | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_ass8) |
| ^=       | x ^= 3  | x = x ^ 3  | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_ass9) |
| >>=      | x >>= 3 | x = x >> 3 | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_ass10) |
| <<=      | x <<= 3 | x = x << 3 | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_ass11) |

| 대입 연산자 |                             설명                             |
| :---------: | :----------------------------------------------------------: |
|     &=      | 왼쪽의 피연산자를 오른쪽의 피연산자와 비트 AND 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함. |
|     \|=     | 왼쪽의 피연산자를 오른쪽의 피연산자와 비트 OR 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함. |
|     ^=      | 왼쪽의 피연산자를 오른쪽의 피연산자와 비트 XOR 연산한 후, 그 결괏값을 왼쪽의 피연산자에 대입함. |
|     <<=     | 왼쪽의 피연산자를 오른쪽의 피연산자만큼 왼쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함. |
|     >>=     | 왼쪽의 피연산자를 오른쪽의 피연산자만큼 부호를 유지하며 오른쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함. |
|    >>>=     | 왼쪽의 피연산자를 오른쪽의 피연산자만큼 부호에 상관없이 오른쪽 시프트한 후, 그 결괏값을 왼쪽의 피연산자에 대입함. |

비트연산자 : http://www.tcpschool.com/c/c_operator_bitwise

## Java Comparison Operators

| Operator | Name                     | Example | Try it                                                       |
| :------- | :----------------------- | :------ | :----------------------------------------------------------- |
| ==       | Equal to                 | x == y  | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_compare1) |
| !=       | Not equal                | x != y  | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_compare2) |
| >        | Greater than             | x > y   | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_compare3) |
| <        | Less than                | x < y   | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_compare4) |
| >=       | Greater than or equal to | x >= y  | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_compare5) |
| <=       | Less than or equal to    | x <= y  | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_compare6) |

------

## Java Logical Operators

| Operator | Name        | Description                                             | Example            | Try it                                                       |
| :------- | :---------- | :------------------------------------------------------ | :----------------- | :----------------------------------------------------------- |
| &&       | Logical and | Returns true if both statements are true                | x < 5 && x < 10    | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_logical1) |
| \|\|     | Logical or  | Returns true if one of the statements is true           | x < 5 \|\| x < 4   | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_logical2) |
| !        | Logical not | Reverse the result, returns false if the result is true | !(x < 5 && x < 10) | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_oper_logical3) |
