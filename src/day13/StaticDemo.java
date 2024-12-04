package day13;

public class StaticDemo {
	
	static int a=10; //static variable
	int b=20;	//Non static variable
	
	static void m1() {
		System.out.println("This is at static method : m1");
	}
	
	void m2() {
		System.out.println("This is at non static method : m2");
	}
	
	void m() {
		System.out.println(a); //non static methods can access everything(both static and non static stuff) directly
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(a); // here a and m1 can be accessed directly
		m1();
		
//		System.out.println(b); // can't access b and m2 since both are non static
//		m2(); 					// to access it need to create object
		
		StaticDemo s = new StaticDemo();
		s.m();
		
		
	}

}
