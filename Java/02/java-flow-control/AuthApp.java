
public class AuthApp {

	public static void main(String[] args) {
		
		String id="Hwang";
		String inputId = args[0];
		
		String pass = "1111";
		String inputPass = args[1];
		
		System.out.println("Hi");
		
		//if(inputId==id){
		if(inputId.equals(id) && inputPass.equals(pass)) {
			System.out.println("Master!");
		} else {
			System.out.println("who are U?");
		}

	}

}