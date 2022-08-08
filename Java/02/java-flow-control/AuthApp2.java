
public class AuthApp2 {

	public static void main(String[] args) {
		
		String id="Hwang";
		String inputId = args[0];
		
		String pass = "1111";
		String pass2 = "2222";
		String inputPass = args[1];
		
		System.out.println("Hi");
		
		boolean isRightPass=(inputPass.equals(pass)||inputPass.equals(pass2));
		if(inputId.equals(id) && isRightPass) {
			System.out.println("Master!");
		} else {
			System.out.println("who are U?");
		}

	}

}
//논리연산자 || && 추가 버젼
