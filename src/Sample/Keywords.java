package Sample;

public class Keywords {

	public static void main(String[] args) {

		for(int i=10; i<=15; i++) {
			
			if(i==13)
			//break;//Totally exits from the loop
			continue;//breaks current process and continues
			System.out.println(i);
		}
	}

}
