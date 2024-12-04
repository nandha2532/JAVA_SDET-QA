package day14;

public class PassingParamsToMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To pass arguments to main method instead of run as Java Application
		//choose run configurations -->Aruguments-->Program arguments--> give the string
		
		System.out.println(args.length);
		
		for(String s : args) {
			System.out.println(s);
		}
		
	}

}
