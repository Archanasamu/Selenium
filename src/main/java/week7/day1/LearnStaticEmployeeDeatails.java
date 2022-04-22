package week7.day1;

public class LearnStaticEmployeeDeatails {
	
	int empID; // Global variable 
	String empName;
	static String empcomp;
	
	
	LearnStaticEmployeeDeatails(int empID, String empName, String empcomp) {
		
		this.empID = empID;
		this.empName = empName;
		this.empcomp = empcomp;
	}
	
	public void printbydetails() {
		System.out.println(empID);
		System.out.println(empName);
		System.out.println(empcomp);
		
	}
	
	public static void employee() {
		System.out.println("Static Method");
		
	}
	
	public static void main(String[] args) {
		
		LearnStaticEmployeeDeatails emp = new LearnStaticEmployeeDeatails(12,"Archana","Comcast");
		//emp.printbydetails();
		
		LearnStaticEmployeeDeatails emp1 = new LearnStaticEmployeeDeatails(12,"Archana","HCL");
		//emp1.printbydetails();
		//emp.printbydetails(); // Overwritten the static value
		
		System.out.println(emp.empID);
		System.out.println(emp1.empName);
		System.out.println(empcomp); // no need to create object
	}

}
