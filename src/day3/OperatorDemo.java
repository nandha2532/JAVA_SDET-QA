package day3;

public class OperatorDemo {
	
	public static void main(String args[]) {
		
//		1) Arithmetic Operator + - * / %
		int a=10,b=3;
		System.out.println("Sum : "+(a+b));
		System.out.println("Diff : "+(a-b));
		System.out.println("Multiplication : "+(a*b));
		System.out.println("Division : "+(a/b));
		System.out.println("Modulo Division : "+(a%b));
		
//		2) Relational operator: > >= < <= != ==
			//Returns boolean value - true/false
			//compares any type of data (int String,...)
		System.out.println(a<b);
		System.out.println(a>b);

//		3) Logical Operators && || !
		//Returns boolean value - true/false
		//works between two boolean variables
		
		boolean x = true;
		boolean y = false;
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		System.out.println((10<20)&&(10<15));
	}

}
