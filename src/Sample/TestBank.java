package Sample;
abstract class Bank{
	abstract void credit();
	abstract void debit();
}
class Hdfc extends Bank{
	public void credit() {
		System.out.println("hdfc credit");
	}
	public void debit() {
		System.out.println("hdfc debit");
	}
}

class Icici extends Bank{
	public void credit() {
		System.out.println("icici credit");
	}
	public void debit() {
		System.out.println("icici debit");
	}
}

public class TestBank {
	public static void main(String args[]) {
		Hdfc hd=new Hdfc();
		hd.credit();
		hd.debit();
		
		Icici ic=new Icici();
		ic.credit();
		ic.debit();
		
	}

}
