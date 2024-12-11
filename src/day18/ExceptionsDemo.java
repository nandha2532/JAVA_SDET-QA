package day18;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Prpgram is started ...");
		Scanner sc =  new Scanner(System.in);
		//Example 1
				/*
		System.out.println("Enter a number :");
		int num = sc.nextInt();
				
		System.out.println(100/num); // Arithemetic exception when num=0
		*/
		
		//Example 2
		/*int a[]=new int[5];
		
		System.out.println("Enter the position (0-4) :");
		int pos = sc.nextInt();
		System.out.println("Enter the value :");
		int value = sc.nextInt();
		
		a[pos] = value;
		
		System.out.println(a[pos]); // ArrayIndexOutOfBoundsException - when pos =5
		*/
		
		//Example 3
		/*String s ="Welcome";
		int num= Integer.parseInt(s); //NumberFormatException
		System.out.println(num);
		*/
		
		//Example 4
		String s1="";
		String s2 = null;
		
		System.out.println(s1.length());
		System.out.println(s2.length()); //NullPointerException --> cant do any operations on null variables
		
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");
		
		}

}
