package day7;

import java.util.Scanner;

public class RevArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		String s[]= new String[5];
		
		for(int i=0;i<s.length;i++) {
			
			System.out.println("ENter the String at "+ i+": ");
			s[i]=sc.next();
					
		}
		
//		String s[]= sc.nex
//		String s[]= {"SAM","SHANE","NANDHA","SIVA","Anandh"};
		
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]+",");
		}
		
		System.out.println();
		for(int i=0;i<s.length;i++) {
			System.out.print(s[s.length-1-i]+" ");
		}
	}

}
