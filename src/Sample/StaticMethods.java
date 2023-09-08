package Sample;

public class StaticMethods {
	
	public static void st() {
		
		System.out.println("Static method executed");
		
	}

	public static void main(String[] args) {

		System.out.println("main method executed");
		
		StaticMethods.st();
	}

}
