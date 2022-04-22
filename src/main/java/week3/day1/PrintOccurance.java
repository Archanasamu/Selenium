package week3.day1;

public class PrintOccurance {
	public static void main(String[] args) {
		String str = "PayPalP";
		char ch = 'P';
		int count=0;
		for(int i=0; i<str.length();i++) {
			if (str.charAt(i) == ch)
			{count++;
				}
	}
System.out.println(count);
}
}
