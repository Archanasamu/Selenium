package week3.day1;

public class Auto extends Vehicle{
	
	int numberOfWheels = 3; 
	
	public void turnOnMeter() {
		System.out.println("Meter Turnerd On");
		
	}
	
	public void runVehicle() {
		applyBrake();
		soundHorn();
		turnOnMeter();
		
	}

}
