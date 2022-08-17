public class ExceptionApp {
	public static void main(String[] args){
		System.out.println(1);
		int[] scores = {10, 20, 30};

		try {
			System.out.println(2);
			System.out.println(scores[3]); //ArrayIndexOutOfBoundsException
			// 여기까지 실행 -> catch(ArrayIndexOutOfBoundsException e)문으로 이동
			System.out.println(3);
			System.out.println(2/0); //ArithmeticException
			System.out.println(4);
		} catch(ArithmeticException e) {
			System.out.println("잘못된 계산요.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("없는 값을 찾고 있다요 ^^");
		} //catch (Exception e) {
//			System.out.println("뭔가 이상합니다. 오류가 발생했습니다.");
//		}			=>모든 예외를 다 나타냄
		System.out.println(5); 
	}
}