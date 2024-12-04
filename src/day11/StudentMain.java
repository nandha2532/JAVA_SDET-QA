package day11;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		
		//ways to store data into variables
		
		//1) using object reference variable
		s1.sId = 1001;
		s1.sName= "SAM";
		s1.grade= 'A';
		
		s1.printData();
		
		//2) Using Method
		
		Student s2 = new Student();
		s2.setStudentData(1002, "Jhon", 'C');
		s2.printData();
		
		//3) Using Constructor
		
		AssignVarConstructor c1 = new AssignVarConstructor(1003, "Smith", 'B');
		c1.printData();
		
	}

}
