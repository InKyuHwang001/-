//인터페이스=규제이다. 자유는 적당한 규제 속에서 나온다.
interface Calculable {
	double PI = 3.14;
	int sum(int v1, int v2);
}
interface Printable{
	void print();
}

class RealCal implements Calculable, Printable {

	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	public void print() {
		System.out.println("this is realcal");
	}
}

public class interfaceApp {
	public static void main(String[] args) {
		
		RealCal c = new RealCal();
		System.out.println(c.sum(2, 1));
		c.print();
		System.out.println(c.PI);
	}
}

//다형성 하나의 클래스가 여러개의 얼굴을 갖도록 하는 것





