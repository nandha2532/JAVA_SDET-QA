package day18;

import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Prpgram is started ...");
		String s1="";
		String s2 = null;
		
		System.out.println(s1.length());
		
		
		try {
			System.out.println(s2.length()); 
		}
		/*
		 * catch(ArithmeticException e) {
			System.out.println("Invalid data");
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException");
		}
		
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}
		 */
		
		catch(Exception e) {
			System.out.println("Exception Handled .....");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");
	}

}
