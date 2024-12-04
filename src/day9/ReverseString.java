package day9;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Approach 1 --> length() , charAt(i)
		String s="";
		s= "Welcome";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev= rev+s.charAt(i);
		}
		System.out.println("String Reverse : "+rev);
		
		//Approach 2 --> without using string methods
		// Converting String to Char Array type
		
		s="Selnium";
		String rev1="";
		char str[]=s.toCharArray();
		
		for(int i=str.length-1;i>=0;i--) {
			rev1= rev1+str[i];
		}
		
		System.out.println("Reversed String : "+rev1);
		
		//Approach 3 --> StringBuffer
		
		StringBuffer sb = new StringBuffer("Selenium");
		
		System.out.println("Reversed String : "+sb.reverse());
		
		//Approach 3 --> StringBuilder
		
		StringBuilder sbl = new StringBuilder("Welcome to Java");
				
		System.out.println("Reversed String : "+sbl.reverse());
	}

}
