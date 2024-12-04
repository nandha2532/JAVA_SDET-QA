package day14;

class Parent{
	 void display(int a) {
		 System.out.println("Parent Value : "+a);
	 }
}

class child1 extends Parent{
	 void show(int b) {
		 System.out.println("child1  Value : "+b);
	 }
}
class child2 extends Parent{
	 void print(int c) {
		 System.out.println("child2 Value : "+c);
	 }
}
public class HierarchyInheritance {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child1 c1 = new child1();
		c1.display(23);
		c1.show(25);
		
		child2 c2 = new child2();
		c1.display(100);
		c1.show(250);

	}

}
