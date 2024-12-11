package day19;

//UpCasting --> converting value from smaller --> larger (automatic process)
//int -->double
//float -->double
//long -->double

//DownCasting --> converting value from larger --> smaller (manually we have to convert)
//long --> int
//double --> float



public class TypeCastingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//UpCasting -- automatic smaller --> larger
		int intval = 100;
		long longValue = intval;
		System.out.println(longValue);
		
		float fvalue= 10.5F;
		double dvalue = fvalue;
		
		
		//DownCasting -- manually larger --> smaller
		float fValue = 10.9F;
		int iValue = (int) fValue;
		
		double dValue = 10.2383272362982368983289382;
		float f = (float) dValue;	//10.238327
		
		System.out.println(iValue);
		
		System.out.println(f); //10.238327
		
		
		

	}

}
