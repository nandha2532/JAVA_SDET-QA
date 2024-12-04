package day11;

public class Method {

	//1)	No params 	no return value
	void m1(){
		System.out.println("Hello");
	}
	
	//2)	No params 	return value
	
	String m2()
	{
		return "return hello";
	}
	//3)	Takes params 	no return value
	
	void m3(String s) {
		
		System.out.println("Hello "+s);
	}
	
	//4)	Takes params 	return value
	
	int m4(int a , int b)
	{
		return a+b;
	}
}
