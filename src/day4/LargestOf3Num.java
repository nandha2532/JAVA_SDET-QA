package day4;

import java.util.Scanner;

public class LargestOf3Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter three numbers");
		
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		sc.close();
		
		if(a>b && a>c)
			System.out.println("A is largest number");
		else if(b>a && b>c)
			System.out.println("B is largest number");
		else if(c>a && c>b)
			System.out.println("C is largest number");
		else if(a==b) {
			if(a==c)
				System.out.println("All are equal");
			
			else if(a<c)
				System.out.println("C is largest number");
			
			else
				System.out.println("A and B is largest number");
		}
		
		else if(b==c) {
			if(a==c)
				System.out.println("All are equal");
			
			else if(a>c)
				System.out.println("A is largest number");
			
			else
				System.out.println("B and C is largest numberC is largest number");
		}
		
		else if(a==c) {
			if(a==b)
				System.out.println("All are equal");
			
			else if(a<b)
				System.out.println("B is largest number");
			
			else
				System.out.println("A and C is largest number");
		}	
	}
}
