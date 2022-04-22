package testNg.week5day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnTestngAttributescon {
	
	@Test
	public void createLead() {
		System.out.println("Create Lead");
		throw new NoSuchElementException();
		
	}

	@Test
	public void editLead() {
		System.out.println("Edit Lead");
		
	}
	
	@Test(dependsOnMethods = {"createLead"},alwaysRun=true,enabled=false) 
	public void deleteLead() {
	  System.out.println("Delete Lead");
	  
	  }
	 
	 
}
