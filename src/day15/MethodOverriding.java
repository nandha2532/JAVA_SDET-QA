package day15;

class bank {
	
	double roi(){
		
		return 0.5;
	}
}

class ICICI extends bank{
	
	double roi() {
		return 10.5;
	}
}

class SBI extends bank{
	double roi() {
		return 11.5;
	}
}

class Axis extends bank{
	double roi() {
		return 11.1;
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		bank b = new bank();
		System.out.println(b.roi());
		
		ICICI i = new ICICI();
		System.out.println(i.roi());
		
		SBI sb = new SBI();
		System.out.println(sb.roi());
		
		Axis a = new Axis();
		System.out.println(a.roi());
	}

}
