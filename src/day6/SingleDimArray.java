package day6;

public class SingleDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1) Declare an array
		 * 2) Add values into array
		 * 3) Find length of an array
		 * 4) Read Single value from an Array
		 * 5) Read multiple values from an Array
		 */
		
		int a[]=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		int b[]= {100,200,300,400,500};
		
		//Find length of an array
		System.out.println("Length : "+a.length);
		
		// Read Single value from an Array
		System.out.println(a[4]);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		// Enhanced for loop
		for(int x:a) {
			System.out.println(x);
		}

	}

}
