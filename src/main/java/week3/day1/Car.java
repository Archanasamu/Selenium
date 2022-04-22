package week3.day1;

public class Car extends Vehicle {
	
	/*
	 * public void turnOnAc() { System.out.println("AC Turned ON"); 
	 * }
	 */
	//Method overloading
	
	public void turnAC() {
		turnAC(true); 
			}
	
	public void turnAC(boolean switchch) {
		if (switchch == true) {
			System.out.println("Ac is ON");
		} else {
			System.out.println("AC is OFF");
		}
		
	}
	
	public void callVehicleMethod() {
		
		applyBrake();
		soundHorn();
		
	}
	public static void main(String[] args) {
		Car obj = new Car();
		obj.turnAC(false);
	}
}
