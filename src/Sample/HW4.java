package Sample;
import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		marks=sc.nextInt();		
		if(marks==92) {
			System.out.println("Grade A");
		}else if(marks<92 && marks>90)
		{
			System.out.println("Grade B");
			
		}
		else {
			System.out.println("Grade C");
		}
	}

}
