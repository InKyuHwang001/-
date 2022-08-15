class Sal {
	int v1, v2;
	Sal(int v1, int v2){
		System.out.println("Sal init!!");
		this.v1=v1;
		this.v2=v2;
	}
    public int sum(){return this.v1+v2;}
}
class Sal3 extends Sal{
	Sal3(int v1, int v2){
		super(v1, v2);
		 System.out.println("Sal3 init!!");
	}
    public int minus(){return this.v1-v2;}
}

public class InheritanceApp {

	public static void main(String[] args) {
		Sal s= new Sal(2,1);
		Sal3 s3 = new Sal3(2, 1);
        System.out.println(s3.sum()); // 3
        System.out.println(s3.minus()); // 1
	}
}