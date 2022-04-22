package testNg.week5day2;

import org.testng.annotations.Test;

public class NewLearnTestngAttri {
	                              //packageName.ClassName.MethodName
	
	@Test(dependsOnMethods = {"testNg.week5day2.LearnTestngAttributescon.createLead"}, alwaysRun = true) 
	public void deleteLead()
	{
		System.out.println("Delete Lead");
		
	}


}
