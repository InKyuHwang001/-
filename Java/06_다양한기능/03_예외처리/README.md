# 예외 처리

---

- [정의](## 정의)
- [예외처리와미루기](## 예외처리와미루기)
- [사용자정의예외](##사용자정의예외)
- [오류로그남기기](##오류로그남기기)

---

## 정의

### 프로그램 오류

- 컴파일 오류
  - **문법적 오류**, 개발 환경에서 대부분 감지됨
- 실행 오류
  - 프로그램이 **의도 하지 않은 동작(bug)**을 하거나 프로그램이 중지 되는 오류

### 중요성

- 프로그램의 비정상 종료를 피하여 시스템이 원할이 실행되도록 함
- 오류가 발생한 경우 log를 남겨서 추후 log 분석을 통해 그 원인을 파악하여 bug를 수정하는 것이 중요

### 오류와 예외 클래스

- 시스템 오류(error) : **가상 머신에서 발생**, 프로그래머가 처리 할 수 없는 오류임

  동적 메모리가 없는 경우, 스택 메모리 오버플로우등

- 예외(Exception) :프로그램에서 **제어 할 수 있는 오류**

  읽어들이려는 파일이 존재하지 않거나, 네트웍이나 DB연결이 안되는 경우 등

- 자바는 오류에 대해 **문법적으로 예외 처리를 해야**함

### 예외 클래스들

![예외](./예외.png)

- Arithmetic Exception :정수를 0 으로 나눈 경우 발생
- NullPointerException : 초기화 되지 않은 Object를 사용하는 경우
- ArrayIndexOutOfBoundsException :배열의 크기를 넘어선 위치를 참조하려는 경우
- FileNotFoundException :참조하는 파일이 지정된 위치에 존재하지 않는 경우

---

## 예외처리와미루기

### try_catch

```java
try{
  예회가 발생할 수 있는 코드 부분
} catch(체리할 예외타입 e){
  예외가 발생시 예외를 처리할 부분
}
```

### try_catch_finally

```java
try{
  예회가 발생할 수 있는 코드 부분
} catch(체리할 예외타입 e){
  예외가 발생시 예외를 처리할 부분
} finally {
  무조건 실행되는 구문
}
```

### try_with_resources

- Java7부터 지원

```java
public static void main(String args[]) {
    try (
        FileInputStream is = new FileInputStream("file.txt");
        BufferedInputStream bis = new BufferedInputStream(is)
    ) {
        int data = -1;
        while ((data = bis.read()) != -1) {
            System.out.print((char) data);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```

- close()를 명시적으로 호출하지 않아도 try{}블록에서 열린 리소스는 정상적인 경우나 예외가 발생한 경우 모두 자동으로 해제됨
- 해당 리소스 클래스가 AutoCloseable 인터페이스를 구현 해야 함
- 자바 9 부터 리소스는 try() 외부에서 선언하고 변수만을 try(obj) 와 같이 사용할 수 있음

### 예외 처리 미루기

- throws를 이용하면 예외가 발생할 수 있는 부분을 사용하는 문장에서 예외를 처리할 수 있음

---

## 사용자정의예외

### 사용자 정의 예외 클래스 구현하기

- 기존 예외 클래스중 가장 유사한 예외 클래스에서 상속 받아 사용자 정의 예외 클래스를 생성 가능
- 기본적으로 Exception 클래스를 상속해서 만들 수 있음

### 예

```java
public class PasswordException extends IllegalArgumentException{
	
	public PasswordException(String message) {
		super(message);
	}
}
```

```java
public class PasswordTest {

		private String password;
		
		public String getPassword(){
			return password;
		}
		
		public void setPassword(String password) throws PasswordException{
			
			if(password == null){
				throw new PasswordException("비밀번호는 null 일 수 없습니다");
			}
			else if( password.length() < 5){
				throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
			}
			else if (password.matches("[a-zA-Z]+")){
				throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
			}
			
			this.password = password;
		}
		
		public static void main(String[] args) {

			PasswordTest test = new PasswordTest();
			String password = null;
			try {
				test.setPassword(password);
				System.out.println("오류 없음1");
			} catch (PasswordException e) {
				System.out.println(e.getMessage());
			}
			
			password = "abcd";
			try {
				test.setPassword(password);
				System.out.println("오류 없음2");
			} catch (PasswordException e) {
				System.out.println(e.getMessage());
			}
			
			password = "abcde";
			try {
				test.setPassword(password);
				System.out.println("오류 없음3");
			} catch (PasswordException e) {
				System.out.println(e.getMessage());
			}
			
			password = "abcde#1";
			try {
				test.setPassword(password);
				System.out.println("오류 없음4");
			} catch (PasswordException e) {
				System.out.println(e.getMessage());
			}
		}
}
```

---

## 오류로그남기기

### logging 

- 오류가 발생 했을 때 그 오류에 대한 기록을 남겨 디버깅을 용이하게 함
- 적정한 로그
  - 너무 적은 로그 : 정확한 시스템의 상황을 파악하기 어려움
  - 너무 많은 로그 : 빈번한 file I/O의 오버헤드와 로그 파일의 백업 문제

### java.util.logging

- 자바에서 기본적으로 제공되는 log package
- jre/lib/logging.properties 파일을 편집하여 로그의 출력방식 로그 레벨을 변경 할 수 있음

```java
package log;
 
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
 
public class MyLogger {
	// String을 기준으로 Logger 클래스 인스턴스 할당
	Logger logger = Logger.getLogger("mylogger");
	private static MyLogger instance = new MyLogger();
	
	// Level별 Log를 생성할 파일 지정
	public static final String errorLog = "log.txt";
	public static final String warningLog = "warning.txt";
	public static final String fineLog = "fine.txt";
	
	private FileHandler logFile = null;
	private FileHandler warningFile = null;
	private FileHandler fineFile = null;
	
	private MyLogger() {
		try {
			// path, append 방식으로 생성
			logFile = new FileHandler(errorLog, true);
			warningFile = new FileHandler(warningLog, true);
			fineFile = new FileHandler(fineLog, true);
		}catch(SecurityException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		logFile.setFormatter(new SimpleFormatter());
		warningFile.setFormatter(new SimpleFormatter());
		fineFile.setFormatter(new SimpleFormatter());
		
		logFile.setLevel(Level.ALL);
		fineFile.setLevel(Level.FINE);
		warningFile.setLevel(Level.WARNING);
		
		logger.addHandler(logFile);
		logger.addHandler(fineFile);
		logger.addHandler(warningFile);
	}
	
	public static MyLogger getLogger() {
		return instance;
	}
	
	public void log(String msg) {
		logger.finest(msg);
		logger.finer(msg);
		logger.fine(msg);
		logger.config(msg);
		logger.info(msg);
		logger.warning(msg);
		logger.severe(msg);
	}
	
	public void fine(String msg) {
		logger.fine(msg);
	}
	
	public void warning(String msg) {
		logger.warning(msg);
	}
}
```



