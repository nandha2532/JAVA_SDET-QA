package day7;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,4,2,6,7,1,10,5,15,12};
		
		
		System.out.println(Arrays.toString(a));
		
//		for(int x:a) {
//			System.out.print(x+",");
//		}
		
		Arrays.sort(a);
		
		System.out.println("Sorted array : "+ Arrays.toString(a));
	}

}
