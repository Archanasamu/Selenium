package week6.day2;

public class ConstructorEmployee extends Company{
	
	int empID;
	String empName;
	boolean isActive;
	
	ConstructorEmployee(){
		/*
		 * empID =100; empName="Archana"; isActive=true;
		 */
		System.out.println("Default Constructor");
		
	}
	
	// Constructor OverRiding
	ConstructorEmployee(int id, String name){
		empID=id;
		empName=name;
		
	}
	
	public void employeeDetails() {
		System.out.println("Employee Details");
		
	}
	
	public static void main(String[] args) {
		
		ConstructorEmployee emp = new ConstructorEmployee(1522,"Archana");
		
		  System.out.println(emp.empID); 
		  System.out.println(emp.empName);
		  System.out.println(emp.isActive);
		 
		
	}

}
