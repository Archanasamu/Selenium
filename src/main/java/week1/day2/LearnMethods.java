package week1.day2;

public class LearnMethods {
	String name = "Archana";
	public int num = 10;
	
// Syntax to create a Method 
// Access Modifier Return-Type methodName(args){}

	public void printName() {
		System.out.println("My name is Archana");
	}
	
	public void printMyName(String name) {
		System.out.println("My name is "+name );
	}
	
	public int addTwoNumbers(int num1, int num2) {
		int sum =num1+num2;
		return sum; 
		
	}

	public static void main(String[] args) {
		LearnMethods obj = new LearnMethods();
		obj.printName();
		obj.printMyName("Samyukta");
		System.out.println(obj.addTwoNumbers(5, 3));
		int newnum = obj.num;
		//int result = obj.addTwoNumbers(5,4); 
		//System.out.println("Result=" +result);
		//obj.addTwoNumbers(4, 4); ctrl+2,L
	}
	
}

