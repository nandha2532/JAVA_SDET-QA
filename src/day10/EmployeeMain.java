package day10;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		emp1.eId=101;
		emp1.eName="SAM";
		emp1.job="Manager";
		emp1.sal=12000;
		
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.eId=102;
		emp2.eName="Jhon";
		emp2.job="Assistant Manager";
		emp2.sal=11000;
		
		emp2.display();
	}

}
