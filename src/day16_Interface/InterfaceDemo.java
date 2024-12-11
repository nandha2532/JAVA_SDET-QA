package day16_Interface;

interface Shape{
	int length = 20;	//final & static
	int width = 10;	//final & static
	
	void circle(); //abstract method without implementation
	
	//methods with implementation is not allowed in Interface
	/*
	 * void square() {
		
		} 
	 */
	
	
	// but by adding static and default keyword we can use implemented methods in Interface
	
	default void rectangle() {
		System.out.println("Implementation of rectangle");
	}
	
	static void square() {
		System.out.println("Implementation of square");
	}
	
	
	
}

public class InterfaceDemo implements  Shape{


	//Cannot reduce the visibility of the inherited method from Shape
	/*
	 *  In interface all the methods are public by default  whereas in class it is default 
	 * void circle() {
			}
	 */
	
	// SO public keyword has to added before the method
	public void circle() {
		System.out.println(" Impelemenation of circle");
		
	}
	
	void triangle() {
		System.out.println(" Impelemenation of triangle");
		
	}
	
	int x=25,y=35;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//scenario 1
		InterfaceDemo obj = new InterfaceDemo();
		obj.circle();
		obj.rectangle();
		//square(); even though it is static the method is not part of the class so classname.method
		Shape.square();
		obj.triangle();  // is accessible only by the object of this class
		System.out.println(obj.x);
		System.out.println(obj.y);
		
		//scenario 2
		
		// cant instantiate
		//Shape s = new Shape();
		
		Shape s  = new InterfaceDemo(); //can create object reference for Interface
		s.circle();
		//s.triangle();	//The method triangle() is undefined for the type Shape		
		
		System.out.println(Shape.width);
	
	}
	
	
	
	

}
