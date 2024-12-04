package day15;

class Test{
	
	int x= 100;
	final int y=250;
	
}

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.x=200;
		System.out.println(t.x);
		
		//t.y=300;	// this is not possible since final variable can't be changed
	}

}
