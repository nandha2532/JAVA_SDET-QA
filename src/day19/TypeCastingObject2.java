package day19;

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}


public class TypeCastingObject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A b = (C)d
//		Animal a = new Animal();
		//Rule 1:conversion is valid or not
		// type of  C & d must have some relationship
		Animal an = new Dog();
		Cat ct = (Cat)an;
//		Cat c1 = (Cat)dg;//not valid by rule 1
		
		//Rule 2: Assignment is valid or not
		// C must be either same or child of A
		
//		Cat ct = (Dog)an; //not valid by rule 2
		
//		If rule 1 or 2 fails it will show compile time error.
//		If rule 3 fails -->will get run time error.
		
		//Rule 3: Underlying object type 'd' must be either same or child of 'C'
		
		Animal a1 = new Dog();
		Dog dg = (Dog)a1;		//Satisfies --> all 3 rules 
		

	}

}
