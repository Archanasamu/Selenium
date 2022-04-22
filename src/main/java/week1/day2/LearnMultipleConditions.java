package week1.day2;

public class LearnMultipleConditions {
	
	public static void main(String[] args) {
		int salary = 17000, bankbalance = 500000;
		String car = "i20";
		
		if (salary >=70000) {
			
		System.out.println("Qualified");
		}
		
		else if(car =="Duster") {
			System.out.println("Qualified");
			
		}
		
		else if (bankbalance>=700000) {
			System.out.println("Qualified");
		}
		else {
			System.out.println("Not Qualified");
		}
	}
	

}
