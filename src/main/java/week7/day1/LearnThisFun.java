package week7.day1;

public class LearnThisFun {
	
	int empID; // Global variable 
	String empName;
	String empcomp;
	
	LearnThisFun() {
		this(10,"Archana","Comcast");
		System.out.println("Default Constructor");
	}
	
	LearnThisFun(int empID, String empName, String empcomp) {
		
		this.empID = empID;
		
		this.empName = empName;
		
		this.empcomp = empcomp;
		
		this.empDetails();
	}
	
	public void empDetails() {
		System.out.println("Employee Details");
		
	}
	
	public static void main(String[] args) {
		
		LearnThisFun emp = new LearnThisFun();
		
		System.out.println(emp.empID);
		System.out.println(emp.empName);
		System.out.println(emp.empcomp);
		
	}

}
