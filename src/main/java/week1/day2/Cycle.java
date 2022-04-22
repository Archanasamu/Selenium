package week1.day2;

public class Cycle {
	
	public void cycleName(String Cname) {
		System.out.println("Cycle name is: " + Cname);
	}

	public int cyclePrice() {
		return 3000; 
	}
	
	public String cycleColour() {
		return "Red";
		
	}
	
	/*public int cyclePrice(int price) {
		System.out.println("Cycle Price is:" + price);
		return price;
	}
	
	public String cycleColour(String colour) {
		System.out.println("Cycle Colour: "+ colour);
		return colour;
	}*/

public static void main(String[] args) {
	Cycle obj = new Cycle();
	obj.cycleName("BSA");
	//obj.cyclePrice(2000);
	//obj.cycleColour("Blue");
	System.out.println(obj.cyclePrice());
	System.out.println(obj.cycleColour());
	
}
}

