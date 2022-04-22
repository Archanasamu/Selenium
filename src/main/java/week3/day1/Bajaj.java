package week3.day1;

public class Bajaj extends Auto {
	
	public void switchOnWIFI() {
		System.out.println("WIFI ON");
		
	}
	
	public void localRunAuto() {
		applyBrake();
		soundHorn();
		turnOnMeter();
		System.out.println(numberOfWheels);
		
	}
	
	public static void main(String[] args) { // Static method can't able to call the non-static method 
		Bajaj obj = new Bajaj();
		obj.applyBrake();
		obj.switchOnWIFI();
		
		
	}

}
