package week3.day1;

public class LearnString {
	public static void main(String[] args) {
		String text = "Learning 1123Selenium is 1123fun";
		
		String text1 = "1123";
		//String text1 = "is";
		
		String text2 = null; // memory won't create
		int text3 = 12345;
		
		/*char[] allChar = text.toCharArray();
		
		
		  for(int i=0;i<allChar.length;i++) { 
			  
			  System.out.println(allChar[i]);
			  
		 }
			System.out.println(text.length());
		
		char lastChar = text.charAt(text.length()-1); // text.lenght -> count-> count-1 -> Index
		System.out.println(lastChar);
		
		String joining = text1.concat(text);
		System.out.println(text1.concat(text)); // it will through an exception when trying to join the null and strings
		System.out.println(text1+text); // (it will accept the null value on joining the strings)
		
		String str = Integer.toString(text3);
		System.out.println(str);
		
		System.out.println(text.substring(0, 9)); // extract the strings
		System.out.println(text.substring(9));
		
		System.out.println(text);
		System.out.println(text.trim());// trims the starting and end space
		
		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());
		
		String[] seperateeach = text.split("e");  // Delimitor (space, character, number) - split the string whereever space is available
		
		for(int i=0;i<seperateeach.length;i++) { 
			  
			  System.out.println(seperateeach[i]);  
		 }
		
		int indexnum = text.indexOf("S"); 
		System.out.println(text.substring(0, indexnum+1));
		System.out.println(text.indexOf("e"));
		System.out.println(text.lastIndexOf("e"));
		
		   // out will be boolean
		  System.out.println(text.endsWith("u"));
		  System.out.println(text.contains("i"));
		  
		System.out.println(text.startsWith("learning"));
		System.out.println(text.endsWith(text1));
		System.out.println(text.contains(text1));
		
		  System.out.println(text.replace('f', 'B'));
		  System.out.println(text.replace("is", text1));
		 */
		
		System.out.println(text);
		System.out.println(text.replaceAll(text1, ""));
		
		String text4 = "TestComp1 (1001)";
		// \d - only non digit and \D - only digit 
		System.out.println(text4.replaceAll(("\\D"), ""));
		
	}

	
	

}
