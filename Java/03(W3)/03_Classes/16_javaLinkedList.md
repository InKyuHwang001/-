# Java LinkedList
## Java LinkedList

`LinkedList`는 `ArrayList`와 유사하다.

```java
// Import the LinkedList class
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```

## ArrayList vs. LinkedList

### ArrayList 작동 방식

`ArrayList`에는 내부에 일반 배열이 있다. 요소가 추가되면 배열에 배치된다. 어레이가 충분히 크지 않으면 이전 어레이를 대체하기 위해 더 큰 새 어레이가 생성되고 이전 어레이는 제거된다.

### LinkedList 작동 방식

`LinkedList`항목을 "컨테이너"에 저장한다. 목록에는 첫 번째 컨테이너에 대한 링크가 있고 각 컨테이너에는 목록의 다음 컨테이너에 대한 링크가 있다. 목록에 요소를 추가하기 위해 요소는 새 컨테이너에 배치되고 해당 컨테이너는 목록의 다른 컨테이너 중 하나에 연결된다.

## Linked List Methods

| Method        | Description                                    | Try it                                                       |
| :------------ | :--------------------------------------------- | :----------------------------------------------------------- |
| addFirst()    | Adds an item to the beginning of the list.     | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_linkedlist_addfirst) |
| addLast()     | Add an item to the end of the list             | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_linkedlist_addlast) |
| removeFirst() | Remove an item from the beginning of the list. | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_linkedlist_removefirst) |
| removeLast()  | Remove an item from the end of the list        | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_linkedlist_removelast) |
| getFirst()    | Get the item at the beginning of the list      | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_linkedlist_getfirst) |
| getLast()     | Get the item at the end of the list            | [Try it »](https://www.w3schools.com/java/tryjava.asp?filename=demo_linkedlist_getlast) |

