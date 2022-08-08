public class LoopApp {
 
    public static void main(String[] args) {
         
        System.out.println(1);
        System.out.println("=== while ===");
        int i = 0;
        while(i < 3) {
            System.out.println(2);
            System.out.println(3);
//          i = i + 1;            
            i++;//위의 코드를 간단화 한것
        }
        //while문은 조건식이 참일 동안에 코드블럭의 작업을 반복
        System.out.println("=== for ===");
        for(int j=0; j < 3; j++) {
            System.out.println(2);
            System.out.println(3);
        }
        //for(변수의 초기화; 조선식; 1회 반복이 끝나고 수행할 연산)
        //for문은 코드가 응집되어 있어 실수할 확률이 줄어듬
        System.out.println(4);
 
    }
 
}