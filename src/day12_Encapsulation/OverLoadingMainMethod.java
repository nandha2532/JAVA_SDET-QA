package day12_Encapsulation;

public class OverLoadingMainMethod {
	
	void main(int x) {
		System.out.println(x);
	}
	void main(double x) {
		System.out.println(x);
	}
	void main(String x) {
		System.out.println(x);
	}
	void main(String s1,String s2) {
		System.out.println(s1+s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverLoadingMainMethod o = new OverLoadingMainMethod();
		
		o.main(2);
		o.main("Hello");
		o.main("Hello", "World");
		o.main(10.6);
	}

}
