package day9;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//case 1
		String s1= "Welcome";
		String s2= "Welcome";
		
		System.out.println(s1==s2); 
		System.out.println(s1.equals(s2));
		
		
		//case 2
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		
		System.out.println(s3==s4); //used to compare objects
		System.out.println(s3.equals(s4)); //used to compare values of objects
		
		//case 3
		String s5 ="abc";
		String s6 = new String("abc");
				
		System.out.println(s5==s6); //used to compare objects
		System.out.println(s5.equals(s6)); //used to compare values of objects
		
		//case 4
		System.out.println("case 4");
		String a1 ="abc";
		String a2 = new String("abc");
		String a3=a2;
						
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		
		System.out.println(a2==a3);
		System.out.println(a2.equals(a3));
		
		System.out.println(a1==a3);
		System.out.println(a1.equals(a3));
		
	}

}
