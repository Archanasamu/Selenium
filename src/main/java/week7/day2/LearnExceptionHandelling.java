package week7.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LearnExceptionHandelling {

	public int divide(int num1, int num2) {

		int num3;

		if (num1 < num2) {

			throw new ArithmeticException();
		}

		else {
			num3 = num1 / num2;
		}
		return num3;

	}

	public static void main(String[] args) throws FileNotFoundException {
		//FileInputStream fis = new FileInputStream("./Data/result.xlsx"); 
		
		  LearnExceptionHandelling leh = new LearnExceptionHandelling(); 
		  int result =0;
		  try { 
			  result = leh.divide(5, 10); 
			  } 
		  catch (ArithmeticException e) {
		  System.out.println("Invalid input ");
		  }
		  
		  System.out.println(result);
		 
	}

}
