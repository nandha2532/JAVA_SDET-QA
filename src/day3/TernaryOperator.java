package day3;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ternary Operator --> var = exp ? result1 : result2
		
//		Example1
		int a= 100;
		int b=200;
		
//		int x= (a<b)?b:a;
		int x= a>b ? a:b;
		
		System.out.println("result : "+x);
		
//		Example2
		int y = (1==1)?100:200;
		System.out.println(" Result2 : "+y);
		int z = (1==2)?100:200;
		System.out.println(" Result2-- : "+z);
		
//		Example3
		int age = 30;
		String res = (age>18)? "Eligible":"Not Eligible";
		System.out.println(res+" to vote");
		
	}

}
