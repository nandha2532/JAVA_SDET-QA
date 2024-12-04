package day3;

import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("Entered value a : "+a);
		System.out.println("Entered value b : "+b);
		
	}

}
