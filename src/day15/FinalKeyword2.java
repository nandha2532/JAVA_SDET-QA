package day15;


class Test1{
	void m() {
		System.out.println("Test1 method");
	}
	
	
	
	final void m1() {
		System.out.println("Test1 method");
	}
	
	void m1(int x) {
		System.out.println(x);
	}
}

final class Test2 extends Test1{
	void m() {
		System.out.println("Test2 Method");
	}
	//we cannot override final method
//	void m1() {		
//		System.out.println("Test1 method");
//	}
}


// WE CANNNOT EXTENDS FINAL CLASS
//class Test3 extends tes2{ 
//	
//}



public class FinalKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 t1 = new Test1();
		t1.m1(12);
	}

}
