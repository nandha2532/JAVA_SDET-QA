package day12_Polymorphism;

public class AdderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adder ad= new Adder();
		
		ad.sum();
		ad.sum(10, 15);
		ad.sum(12,3.7);
		ad.sum(5.4,19);
		ad.sum(6.7,9.4);
		ad.sum(1,2,3);
	}

}
