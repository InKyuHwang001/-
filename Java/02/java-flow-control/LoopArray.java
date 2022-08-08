
public class LoopArray {

	public static void main(String[] args) {
		/*
         *  <li>hwang</li>
         *  <li>in</li>
         *  <li>kyu</li>
         */
		 
		String[] users = new String[3];
        users[0] = "hwang";
        users[1] = "in";
        users[2] = "kyu";
        
        for(int i=0; i<users.length; i++) {
        	System.out.println("<li>"+users[i]+"</li>");
        }

	}

}
