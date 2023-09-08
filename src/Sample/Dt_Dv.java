package Sample;

public class Dt_Dv {
	
	int b=20;//instance variable
	static int empid=100;

	public void m1() {
		
		int a=10;//local variable
		
		System.out.println("m1 method executed");
		System.out.println(a + "Local Variable");

	}
	
	public void m2() {
		
		System.out.println("m2 method executed");
		System.out.println(b + "Instance Variable");
		System.out.println(empid + "Static Variable");

		
	}
	public static void main(String[] args) {
		
		System.out.println("main method executed");
		System.out.println(empid + "Static Variable");

		Dt_Dv m=new Dt_Dv();
		m.m1();
		m.m2();

	}

}
