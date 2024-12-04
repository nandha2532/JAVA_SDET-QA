package day7;

public class RepetitionNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {100,200,100,200,300,100,200,100};
		
		int num =100;
		int count=0;
		
		for(int x:a) {
			
			if(num==x) {
				count++;
			}
		}
		
		System.out.println("Count is : "+count);
	}

}
