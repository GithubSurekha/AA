package Sample;

class M{
	int a=30;
	int b=40;
	public void m1() {
		System.out.println("m1 executed");
		
	}

}

class N extends M{
	  
	int x=40;
	int y=20;
	public void m2() {
		System.out.println("m2 executed");
		System.out.println(a+b);
	}
}

public class MLI extends N{

	public void m3() {
		System.out.println("m3 executed");
		System.out.println(a+b);
		System.out.println(x-y);
	
}


	public static void main(String[] args) {
		MLI s=new MLI();
		s.m1();
		s.m2();
		s.m3();
		
	}
}