package week7.day2;

import java.io.IOException;

public class LearnException {

	public static void main(String[] args) throws IOException {

		int x = 10;
		int y = 2;

		int a[] = { 3, 4, 5 };

		try {
			System.out.println(x / y);
			System.out.println(a[3]);
		}

		catch (ArithmeticException e) {
			System.out.println(e);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("User defined Array out of boundary");
		}

		catch (Exception e) {
			System.out.println(e);
		}
		
		finally{
			Runtime.getRuntime().exec("TASKKILL /F /IM chromedriver.exe");
		}
		
		System.out.println("End of code");
		
		
	}

}
