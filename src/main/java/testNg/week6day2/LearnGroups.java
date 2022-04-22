package testNg.week6day2;

import org.testng.annotations.Test;

public class LearnGroups {
	
	@Test(groups = {"regression"})
	public void Testcase1() {
		System.out.println("Testcase1");
		
	}

	@Test(groups = {"regression"})
	public void Testcase2() {
		System.out.println("Testcase2");
		
	}
	@Test(groups = {"regression"})
	public void Testcase3() {
		System.out.println("Testcase3");
		
	}
	@Test(groups = {"regression","functional"})
	public void Testcase4() {
		System.out.println("Testcase4");
		
	}
	@Test(groups = {"functional"})
	public void Testcase5() {
		System.out.println("Testcase5");
		
	}
	@Test(groups = {"smoke"})
	public void Testcase6() {
		System.out.println("Testcase6");
		
	}
	
}
