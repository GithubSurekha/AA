package Sample;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int a,b,ch;
		
		System.out.println("1.Addition");
		
		System.out.println("2.Substraction");
		
		System.out.println("3.Multiplication");
		
		System.out.println("enter a value");
		
		a=sc.nextInt();
		
		System.out.println("enter b value");
				
		b=sc.nextInt();
		
		System.out.println("enter your choice");
		
		ch=sc.nextInt();

		switch(ch)
		{
			case 1:				
				System.out.println(a+b);
				break;
				
			case 2:
				System.out.println(a-b);
				break;
			
			case 3:
				System.out.println(a*b);
				break;
				
			default :
				System.out.println("Invalid choice");
				
		}
		
						
		}
		
	}

