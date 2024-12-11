package day19;

class Parent{
	String name ="Jhon";
	
	void m1() {
		System.out.println("This is m1 from Parent");
	}
}

class Child extends Parent{
	int id =101;
	
	void m2() {
		System.out.println("This is m2 from Child");
	}
}

public class TypeCastingObject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c =new Child();
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		
		Parent p = new Child(); 	// UpCasting
		System.out.println(p.name);
		
//		p.m2();
//		p.id;
		
		
	}

}
