package week3.day1;

public class BMW extends Car {
	
	public void switchAutoPilot() {
		System.out.println("Switched to AutoPilot");
		
	}
	
	public void localRunCar() {
		super.applyBrake(); // to call the super class method as well 
		applyBrake();
		soundHorn();
		turnAC();
	}
	
	public void applyBrake() {
		System.out.println("ABS Brake Applied");
		
	}
	
	public static void main(String[] args) {
		BMW obj1 = new BMW();
		obj1.localRunCar();
		
	}
	
	

}
