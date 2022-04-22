package week1.day2;

import java.util.Arrays;

public class LearnArray {
	public static void main(String[] args) {
		//Array - will be represent [] 
		// Array - can't be modified during the runtime
		String[] names = {"Archana", "Boopathi", "Samyukta", "Jivika", "Pranavika"};
		Arrays.sort(names); 
		System.out.println(names[2]);
		for (int i = 0; i < names.length; i++) 
			System.out.println(names[i]);
		String[] friendName = new String[5];
		friendName[0] = "Archana";
		friendName[1] = "Boopathi";
		
	}

}
