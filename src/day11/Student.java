package day11;

public class Student {

	//Class variables
	int sId;
	String sName;
	String dept="Automobile";
	char grade;
	
	void printData() {
		System.out.println(sId+" : "+sName+" - "+dept+" : "+grade);
	}
	
	void setStudentData(int Id,String Name, char grad) {
		//int Id,String Name, char grad --> local variables
		sId= Id;
		sName=Name;
		grade=grad;
		
	}
	
	
}
