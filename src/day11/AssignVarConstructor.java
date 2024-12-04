package day11;

public class AssignVarConstructor {

	int sId;
	String sName;
	String dept="Automobile";
	char grade;
	
	AssignVarConstructor(int Id,String Name, char grad){
		sId= Id;
		sName=Name;
		grade=grad;
	}
	
	void printData() {
		System.out.println(sId+" : "+sName+" - "+dept+" : "+grade);
	}
	
}
