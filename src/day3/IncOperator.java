package day3;

public class IncOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ++--> increment operator
		
//		Case 1
		
		int n = 10;
		n++; // n= n+1
		System.out.println("case 1 : "+n);
		
//		Case 2 --> post increment
		int a = 10;
		int res = a++; 	// first a is assigned to res then it is incremented
		System.out.println("case 2 : "+res); // will  still print res as 10
		System.out.println("case 2(1) : "+a);// will print 11
		
//		Case 3 --> pre increment
		int b = 10;
		int re = ++b; 	// first a is incremented  then it is assigned to res
		System.out.println("case 2 : "+re); // will print 11
		
	}

}
