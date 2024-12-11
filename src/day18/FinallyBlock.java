package day18;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Prpgram is started ...");
		String s1="";
		String s2 = null;
//		s2="Welcome";    

		
		System.out.println(s1.length());
		
		
		try {
			System.out.println(s2.length()); 
		}catch(NumberFormatException e) {
			System.out.println("Exception Handled .....");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("You have entered into finally block");
		}
		
		System.out.println("Program is completed...");
		System.out.println("Program is exited...");
	}

}
