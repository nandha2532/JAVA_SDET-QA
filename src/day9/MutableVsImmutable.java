package day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Mutable
		int a[]= {100,200,400,250,300};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//immutable
		String s= "Welcome";
		System.out.println(s);
		s.concat(" to Java");
		System.out.println(s);
	}

}
