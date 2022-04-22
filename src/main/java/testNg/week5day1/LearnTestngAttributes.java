package testNg.week5day1;

import org.testng.annotations.Test;

public class LearnTestngAttributes {
	
	@Test(invocationCount=3)
	public void createLead() {
		System.out.println("CreateLead");
		
	}
	
	@Test (priority=-1)
	public void editLead() {
		System.out.println("editLead");
		
	}
	
	@Test(enabled=false)
	public void deleteLead() {
		System.out.println("deleteLead");
		
	}

}
