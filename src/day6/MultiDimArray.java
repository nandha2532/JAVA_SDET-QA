package day6;

public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1) Declare an array
		 * 2) Add values into array
		 * 3) Find length of an array
		 * 4) Read Single value from an Array
		 * 5) Read multiple values from an Array
		 */
		
		
		// Declaring Array
		
		int a[][]= new int[3][2];
		
		a[0][0] = 100;
		a[0][1] = 100;
		
		a[1][0] = 100;
		a[1][1] = 100;
		
		a[2][0] = 100;
		a[2][1] = 100;
		
		int b[][]= {{100,200,300},{400,500,600},{700,800,900}};
		
		//Find length of an array
		
		System.out.println("Number of rows : "+b.length);
		System.out.println("NUmber of column : "+b[0].length);
		
		//Read Single value from an Array
		System.out.println(b[1][2]);
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Form enhanced for loop");
		
		for(int arr[]:b) {
			for(int x:arr) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

}
