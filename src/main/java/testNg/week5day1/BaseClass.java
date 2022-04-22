package testNg.week5day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass-Parent");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}
}
