package week4.day2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {
	public static void main(String[] args) {
		String input = "Amazon India";
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		char[] allChar = input.toCharArray(); // convert the given string to character
		
		for (char eachChar : allChar) { // to get the each character using for each
			if (map.containsKey(eachChar)) { // check if map contains key equal to each character
				// find the value of key -> if - fails it will execute below 
				Integer value = map.get(eachChar); // get the each character value and store it to local variable 
				map.put(eachChar, value+1); // if each character is equal to map then add/update 1 to value 
			} 
			// if statement is true execute below
			else {	                   
			map.put(eachChar, 1); // if not add key as new entry  - then initialize as 1 
			}
		}
		//System.out.println(map);
		//System.out.println(map.size());
		
		//remove key - only can remove key not value
		map.remove('i');
		
		// To get the key and value together use entryset
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		// to get all entry key and value using for each
		for (Entry<Character, Integer> allEntry : entrySet) {
			//System.out.println(allEntry);
			//System.out.println(allEntry.getValue());
		    //System.out.println(allEntry.getKey());
			System.out.println(allEntry.getKey()+"-------->"+allEntry.getValue());
			
		}
		
		map.clear();
		System.out.println(map.isEmpty());
		
		
	}
	

}
