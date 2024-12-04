package day12_Polymorphism;

public class Adder {
	
	int a=10,b=20;
	
	void sum() {
		System.out.println("Class variable : "+a+b);
	}
	
	void sum(int x,int y) {
		System.out.println("Add 2 int : "+(x+y));
	}
	
//	void sum(int x,double y) {
//		System.out.println("Add int & double : "+(x+y));
//	}
	
	void sum(double x,int y) {
		System.out.println("Add double & int : "+(x+y));
	}
	void sum(double x,double y) {
		System.out.println("Add 2 double : "+(x+y));
	}
	
	
	void sum(int x,int y, int z) {
		System.out.println("Add 3 int : "+(x+y+z));
	}
	
	
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
