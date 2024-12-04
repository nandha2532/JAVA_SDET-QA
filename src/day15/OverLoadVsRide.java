package day15;

class ABC{
	void m1(int a){
		System.out.println(a);
	}
	void m2(int b){
		System.out.println(b);
	}
}

class XYZ extends ABC{
	void m1(int a){
		System.out.println(a*a);  //method overriding
	}
	
	void m2(int b){
		System.out.println(b+b);  //method overriding
	}
	
	
	void m2(int a, int b){	//method overloading
		System.out.println(b);
	}
}

public class OverLoadVsRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XYZ x = new XYZ();
		x.m1(12);
		x.m2(25);
		x.m2(2);
		x.m2(20,40);
	}

}
