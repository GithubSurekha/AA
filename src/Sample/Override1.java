package Sample;

public class Override1 extends Override{
	
public void add(int a,int b) {
		
		System.out.println(a-b);
		System.out.println("New featute");
	}
	
public static void main(String args[]) {
	Override1 obj=new Override1();
	obj.add(10, 20);
}

}
