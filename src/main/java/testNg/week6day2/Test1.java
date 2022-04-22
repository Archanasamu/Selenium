package testNg.week6day2;

import org.testng.annotations.Test;

public class Test1 {

	@Test(timeOut = 500) //retryAnalyzer = RetryFailed.class)
	public void createLead() throws InterruptedException {
		
		
		  long ranNum = (long) (Math.random()*1000); 
		  System.out.println("Create Lead: "+ ranNum);
		  
		  Thread.sleep(ranNum);
		 
		//throw new NoSuchElementException();
		
	}
}
