package day11;

public class ConstructorDemo {

	int x,y;
	
	ConstructorDemo(){ //default constructor
		x=100;
		y=200;
	}
	
	ConstructorDemo(int a, int b){//Parameterized constructor
		x=a;
		y=b;
	}
	
	void sum() {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo cd1 = new ConstructorDemo();
		ConstructorDemo cd2 = new ConstructorDemo(25,50);
		
		cd1.sum();
		cd2.sum();
	}

}
