package day13;

public class ThisKeyword {

	//Class variables --> variables in the class and outside the method
	//				  --> can be accessed by all the methods in the class
	int x,y;
	
//	ThisKeyword(int a,int b){
//		x=a;
//		y=b;
//	}
	
	ThisKeyword(int x,int y){ //When both class variables and local variables are same 
		this.x=x;		//use this keyword to refer current class variable
		this.y=y;
	}
	
	void setData(int x,int y) {
		this.x=x;		//use this keyword to refer current class variable
		this.y=y;
	}
	
	void Display() {
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword k = new ThisKeyword(15,20);
		k.Display();
		ThisKeyword k1 = new ThisKeyword(15,20);
		
		k1.setData(20,40);
		k1.Display();
	}

}
