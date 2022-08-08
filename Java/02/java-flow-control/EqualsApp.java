public class EqualsApp {
	public static void main(String[] args) {

		int p1=1;
		int p2=2;
		
		System.out.println(p1==p2);
		
		String o1= new String("java");
		String o2= new String("java");
		
		System.out.println(o1.equals(o2));
		
		String o3= "java2";
		String o4= "java2";
		
		System.out.println(o3==o4);
	}
}

//==vs equals
//==: 같은 곳을 가르키고 있냐? 
	// 원시데이터 타입에 사용
//equals: 같은 값이냐?	
	//원시데이터 타입이 아닌 곳에 사용