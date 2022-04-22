package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnSet {
	
	public static void main(String[] args) {
		//Syntax: List<RapperClassDatatype> objectname = new implementation method();
 		
		List<String> nameList = new ArrayList<>(); 
		
		//LinkedList - Node - |Value|Address|
		//ArrayList - Index - index(inteter)
		
		nameList.add("Archana");
		nameList.add("Boopathi");
		nameList.add("Samyukta");
		nameList.add("Jivika");
		nameList.add("Archana");
		nameList.add("Pranavika");
		
		System.out.println(nameList);
		System.out.println(nameList.size());
		System.out.println(nameList.get(3));
		
		// for each loop - will itrate every item in the list. Syntax: for(dataType tempVariableName : collections)
		
		for ( String eachName : nameList) {
			System.out.println(eachName);
		}
		
		/*
		 * System.out.println(nameList.remove(4));
		 * System.out.println(nameList.contains("Pranavika")); nameList.clear();
		 * System.out.println(nameList.isEmpty()); System.out.println(nameList);
		 */
		
		
	}

}
