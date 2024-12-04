package day5;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1; 						//initialization
		
		while(i<=10) { 					// condition
			System.out.println(i);
			i++; 						//	Increment/Decrement
		}
		
		int n=1; 						//initialization
		
		while(n<=10) { 					// condition
			
			if(n%2==0) {
				System.out.println(n+" Even");
			}	
			else
				System.out.println(n+" Odd");
			
			n++; 						//	Increment/Decrement
		}
	}

}
