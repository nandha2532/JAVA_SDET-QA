package day18;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Prpgram is started ...");
		Scanner sc =  new Scanner(System.in);
		//Example 1
	
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		try {
		System.out.println(100/num); // Arithemetic exception when num=0
		}catch(ArithmeticException e) {
			System.out.println("Invalid data");
		}
		
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");
	}

}
