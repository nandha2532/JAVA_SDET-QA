package day14;

//In a Java class file there should be only one class with public access modifier
	class A{
		int a=100;
		void display() {
			System.out.println("A class - Value in : "+ a);
		}
		
	}
	
	class B extends A{
		int b=200;
		int x;
		void show() {
			System.out.println("B class - Value : "+ b);
			System.out.println("B class - Value of X : "+ x);

		}
		
	}
	
	class C extends B{
		int c;
		void print() {
			System.out.println("C class - Value : "+ c);

		}
		
	}

public class InheritanceTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B bobj = new B();
		
		System.out.println(bobj.a);
		System.out.println(bobj.b);
		
		bobj.display();
		bobj.show();
		
		//Multilevel inheritance
		
		C cobj =new C();
		cobj.c=300;
		cobj.x=350;
		
		cobj.display();
		cobj.show();
		cobj.print();
		
		
		
	}

}
