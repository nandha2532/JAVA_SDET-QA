package day17_WrapperClass;

public class DataConversionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String --> int
		String s1 = "12";
		String s2 = "30";
		
		System.out.println(s1+s2);
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		
		String s3="10.04";
		String s4="20.04";
		
		System.out.println(s3+s4);
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		String s5="true";
		String s6="Hello";
		
		System.out.println(Boolean.parseBoolean(s5));
		System.out.println(Boolean.parseBoolean(s6));
		
		//int,double,boolean --> String
		
		int a =10;
		double b= 10.5;
		char c ='a';
		boolean d =true;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(d));
		
		System.out.println(String.valueOf(a)+String.valueOf(b)+String.valueOf(c)+String.valueOf(d));
		
	}

}
