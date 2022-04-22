package testNg.week6day2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListner  implements IAnnotationTransformer {
	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		/*
		 * if (testMethod.getName().equals("editLead")) {
		 * annotation.setInvocationCount(3);
		 * }
		 */
	annotation.setRetryAnalyzer(RetryFailed.class);

}
}