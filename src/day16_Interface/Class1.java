package day16_Interface;

public class Class1 extends Class2 implements  I1,I2{
	
	public void m1() {
		System.out.println(x);
	}
	public void m2() {
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class1 c1 =new Class1();
		c1.m1();
		c1.m2();
		c1.m3();
	}

}
