
public class ArrayApp {
 
    public static void main(String[] args) {
         
        // hwang, in, kyu 
//      String users = "hwang, in, kyu";
        String[] users = new String[3];
        users[0] = "hwang";
        users[1] = "in";
        users[2] = "kyu";
         
        System.out.println(users[1]);
        System.out.println(users.length);
         
        int[] scores = {10, 100, 100}; // 원소, element
        System.out.println(scores[1]);
        System.out.println(scores.length);
 
    }
 
}