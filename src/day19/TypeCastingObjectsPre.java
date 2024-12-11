package day19;


public class TypeCastingObjectsPre {

	public static void main(String[] args) {
		
		Object o = new String("Welcome");
//		StringBuffer sb= (StringBuffer)o;  // Rule 3 Fails
		
//		String s = new String("Welcome");
//		StringBuffer s1= (StringBuffer)s;	//Rule 1 Fails
		
//		Object obj  = new String("Welcome");
//		StringBuffer s2= (String)o;			//Rule 2 Fails
		
		
//		String s =new String("Welcome");
//		StringBuffer sb1 = (String)s;		//Rule 2 Fails
		
		Object obj  = new String("Welcome");
		String s= (String)obj;				// All 3 rules pass
		
		System.out.println(s);
		
	}

}
