package day7;

import java.util.Arrays;
import java.util.Scanner;

public class GetArrayAsInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);

		int a[]= new int[5];
//		System.out.println("Enter 5 numbers : ");
//		a[0]= sc.nextInt();
//		a[1]= sc.nextInt();
//		a[2]= sc.nextInt();
//		a[3]= sc.nextInt();
//		a[4]= sc.nextInt();
		
		System.out.println("Enter "+a.length+" Number :");
		for(int i=0;i<a.length;i++) {
			
			a[i]=sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("Entered Array : "+Arrays.toString(a));
	}

}
