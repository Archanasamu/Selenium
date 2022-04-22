package week3.day2;

public interface RBI extends Cibil, Government { // Multiple inheretance
	
	int minBalance = 500; // Constant Variable/Value 
	
	public abstract void miniumBalance(); // abstract class
	public void maximumLoanAmount(); // abstract class only without key word abstract
	
	default void sample() {
		
	}
}
