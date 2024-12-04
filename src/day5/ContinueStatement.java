package day5;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=10;i++) {
			
			if(i==3 || i==5||i==9) {
				continue; // this will move the execution to inc/dec  
				//this will skip the current iteration statements below
			}
			System.out.println(i);
		}
	}

}
