package testNg.week5day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 extends BaseClass{
	
	@BeforeClass
	public void beforeClassinchild() {
		System.out.println("BeforeClass-child");
	}
		
	@Test
	public void test1() {
		System.out.println("test1");
		
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
		
	}
}
