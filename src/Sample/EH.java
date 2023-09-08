package Sample;

public class EH {

	public static void main(String[] args) {

		try {
		int a[]= {10,20,30,40,50};
		//int a=10/0;
		System.out.println(a[12]);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
}
