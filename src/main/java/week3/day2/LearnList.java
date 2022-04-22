package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnList {
	
	public static void main(String[] args) {
		//Syntax: Set<RapperClassDatatype> objectname = new implementation method();
 		
		Set<String> nameSet = new HashSet<>();  
		
		nameSet.add("Archana");
		nameSet.add("Boopathi");
		nameSet.add("Samyukta");
		nameSet.add("Jivika");
		nameSet.add("Archana");
		nameSet.add("Pranavika");
		
		System.out.println(nameSet);
		System.out.println(nameSet.size());
		
		
		// for each loop - will itrrate every item in the list. Syntax: for(dataType tempVariableName : collections)
		
		/*
		 * for ( String eachName : nameSet) { System.out.println(eachName); }
		 */
		
		 
		  System.out.println(nameSet.remove("Archana"));
		  System.out.println(nameSet.contains("Pranavika")); 
		  nameSet.clear();
		  System.out.println(nameSet.isEmpty()); 
		  System.out.println(nameSet);	
		
	}

}
