package day15;

public class Animal {
	String colour = "white";
	
	void eat() {
		System.out.println("Eating......");
	}
}

class Dogs extends Animal{
	String colour = "Black";
	
	void Display() {
		System.out.println(colour);
		System.out.println("Animal Colour : "+super.colour);
	}
	
	void eat() {
		System.out.println("Eating bread......");
		super.eat();
	}
}
