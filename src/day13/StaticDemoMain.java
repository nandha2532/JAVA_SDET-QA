package day13;

public class StaticDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				System.out.println(StaticDemo.a); // here a and m1 can be accessed directly
				StaticDemo.m1();
				
//				System.out.println(b); // can't access b and m2 since both are non static
//				m2(); 					// to access it need to create object
				
				StaticDemo s = new StaticDemo();
				s.m();
				
		
	}

}
