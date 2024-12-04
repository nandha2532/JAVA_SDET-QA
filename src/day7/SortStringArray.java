package day7;

import java.util.Arrays;

public class SortStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"SAM","SHANE","NANDHA","SIVA","Anandh"};
		String s1[]= {"D","A","H","a","E"};
		
		System.out.println(Arrays.toString(s));
		Arrays.sort(s);
		Arrays.sort(s1);
		
		System.out.println("Sorted Array : "+Arrays.toString(s));
		System.out.println("Sorted Array : "+Arrays.toString(s1));
	}

}
