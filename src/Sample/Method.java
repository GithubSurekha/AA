package Sample;

public class Method {

		
		public void m1(){
			
			System.out.println("m1 method executed");
		}
		
		public void m2(){
			
			System.out.println("m2 method execcuted");
		}
	
		public static void main(String[] args) {
			
			System.out.println("main method executed");
			
			Method m=new Method();
			
			m.m1();
			m.m2();
				
			
	}

}
