package day2;

public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 100,b=200;
		
		System.out.println("value of a : "+a);
		System.out.println("value of b : "+b);
		
		System.out.println("value of a+b : "+a+b);
		System.out.println("value of a+b : "+(a+b));
		
		byte by = 127;
		System.out.println("byte value : "+by);
		
		short st = 127;
		System.out.println("short value : "+st);
		
//		long l= 1276343434; if any error shown add literal at the end of the number 123L or 123l (or) 888.878F
		
		long l= 1276343434L;
		System.out.println("Long value : "+l);
		
		float f = 123.343453F;//literal is needed F or f
		System.out.println("Float : "+f);
		
		double d = 1223.378478348784332;
		System.out.println("Double : "+d);
		
		char ch = 'a';
		System.out.println("char : "+ch);
		
		String name = "Name";
		System.out.println("String : "+name);
		
		/*char c1 = 'ABC'; //invalid
		String s1 = 'ABC'; //invalid
		String s2 = 'A'; //invalid*/
		String s3 = "A"; //valid
		
		boolean b1 = true;
		boolean b2 = false;

	}

}
