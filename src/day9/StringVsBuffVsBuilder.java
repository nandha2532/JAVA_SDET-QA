package day9;

public class StringVsBuffVsBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String  --> immutable
		String s= "Welcome";
		System.out.println(s);
		s.concat(" to Java");
		System.out.println(s);
		
		//StringBuffer --> mutable
		StringBuffer sf= new  StringBuffer("Welcome");
		System.out.println(sf);
		sf.append(" to Java");
		System.out.println(sf);
		
		//StringBuilder --> mutable
				StringBuilder sb= new  StringBuilder("Welcome");
				System.out.println(sb);
				sb.append(" to Java String Builder");
				System.out.println(sb);
	}

}
