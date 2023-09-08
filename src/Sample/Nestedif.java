package Sample;

public class Nestedif {

	public static void main(String[] args) {

		int a=30;
		int b=20;
		
		if(a==10) {
			
			if(b==20) {
				System.out.println("a value is 10 & b value is 20");
			}
			else {
				System.out.println("b value is not 20");
			}
		}
			else {
				System.out.println("a value is not 10");
			}
		}
	}


