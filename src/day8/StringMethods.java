package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		 s = "Welcome";
//		String s1 = new String("Welcome");
		
		System.out.println(s);
		
		//length() ==> return the length of the string
		System.out.println(s.length());
		System.out.println("Welcome".length());
		
		//COncat
		String s1 = "Welcome";
		String s2 = " to Java";

		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		String s3 = " automation";
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2.concat(s3)));
		
		//trim
		
		String str = "  Welcome ";
		System.out.println(str);
		System.out.println(str.length());
		
		System.out.println(str.trim().length());
		
		//charAt() -->returns  a charcater from String based on Index
		
		String a = "Welcome";
		
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(0));
		
		// contains() --> Returns true/false based on whether a string a present in another string
		
		System.out.println(a.contains("Wel"));
		System.out.println(a.contains("wel"));
		System.out.println(a.contains("om"));
		
		// equals()  equalsIgnoreCase() --> compares to String
		String a1 = "Welcome";
		String a2 = "Welcome";
		String a3 = "welcome";
		
		System.out.println();
		System.out.println(a1.equals(a2));
		System.out.println(a1.equalsIgnoreCase(a3));
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		
		System.out.println(s1.equals("welcome"));
		System.out.println(s1.equalsIgnoreCase("welcome"));

		//replace() --> replace a single/ multiple(Sequence) of character in a String
		s="Welcome to Selenium Java Selenium Python Selenium C#";
		
		System.out.println(s.replace('e', 'x'));
		System.out.println(s.replace("Selenium", "Playwright"));
		
		
		// substring() --> extract some part of the String
		// (0,5)-->this will extract the string till 4th index 5th index wont be included
		// (0,1)--> will extract only 0th index in the String
		System.out.println(s.substring(0,5));
		
		//toUpperCase() 	toLowerCase()
		
		System.out.println(s.toUpperCase()); //WELCOME
		System.out.println(s.toLowerCase()); //welcome
		
		//split()	--> split the string into multiple parts based on delimiter
		
		s="nandhakumar@gmail.com";
		
		String st[] = s.split("@");
		
		System.out.println(st[0]);
		System.out.println(st[1]);
		
		//ex1
		String amt = "$10,15,20,25";
		
		System.out.println(amt.replace("$", ""));
		System.out.println(amt.replace("$", "").replace(",",""));
		
		//ex2
		s = "abc,123@xyx";
		
		String arr1[]= s.split(","); // abc 123@xyx
		System.out.println(Arrays.toString(arr1));
		String arr2[]= arr1[1].split("@");
		System.out.println(Arrays.toString(arr2)); // [123 , xyz]
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		// * % ^ & ( ) ==> cannot use as as delimiter
		
		//ex4
		String name = "John kennedy";
		System.out.println(name.contains("john"));
		
		System.out.println(name.toLowerCase().contains("john".toLowerCase()));
		
		
		
	}

}
