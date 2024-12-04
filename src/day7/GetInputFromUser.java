package day7;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt(); // to get number use nextInt()
		
		System.out.println("Enter a String");
		String s = sc.next(); // to get String use next()
		
		System.out.println("Enter a unknown datatype value : ");
		Object ob = sc.next(); // to get unknown value use next()
		
		System.out.println("Enter a Decimal Value : ");
		double d = sc.nextDouble(); // to get Decimal value use nextDouble()
		
		
		
		System.out.println("Name :"+num);
		System.out.println("String :"+s);
		System.out.println("Object :"+ob);
		System.out.println("Decimal Num :"+d);
	}

}
