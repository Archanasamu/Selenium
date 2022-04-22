package week1.day1;

public class CallAccessModifier {
	public static void main(String[] args) {
		LearnAccessModifier obj = new LearnAccessModifier();
		System.out.println(obj.text1);
		System.out.println(obj.text3);
	//private variable or method can't access outside the class
		//System.out.println(obj.text2);
	}

}
