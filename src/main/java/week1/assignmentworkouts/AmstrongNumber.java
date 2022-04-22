package week1.assignmentworkouts;

public class AmstrongNumber {
	public static void main(String[] args) {
		int n = 371;
		int calculated =0, remainder, original;
		original = n;
		while (n>0) {
			
			remainder = n%10;
			n = n/10;
			
			calculated = calculated+(remainder*remainder*remainder);
		}
			
			if (original==calculated) 
				System.out.println("The given number is Amstorng Number");
				
			 else 
					System.out.println("The given number is not Amstorng Number");
			
		
		/*int calculated=0,reminder,original;  
		original=n;  
		while(n>0){  
			reminder=n%10;  
			n=n/10;  
			calculated=calculated+(reminder*reminder*reminder);  
		}  
		if(original==calculated)  
			System.out.println("It is armstrong number");   
		else  
			System.out.println("It is not armstrong number");   */
	}
	

}
