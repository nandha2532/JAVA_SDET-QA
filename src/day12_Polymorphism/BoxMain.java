package day12_Polymorphism;

public class BoxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box b= new Box();
		System.out.println("Volume : "+b.volume());
		
		Box b1 = new Box(10.5,12.5,15.6);
		System.out.println("Volume : "+b1.volume());
		
		Box b2 = new Box(10.4);
		System.out.println("Volume : "+b2.volume());
	}

}
