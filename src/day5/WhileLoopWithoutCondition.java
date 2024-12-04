package day5;

public class WhileLoopWithoutCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		
		while(true) {
			System.out.println(i);
			i++;
			
			if(i>20)
				break;
		}
	}

}
