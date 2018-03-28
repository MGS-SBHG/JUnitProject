package application;
 
import org.junit.runner.JUnitCore; // load JUnitCore class.
import org.junit.runner.Result; // load the Result class to get results of the test run.
import org.junit.runner.notification.Failure; //load the Failure class to get all the failures.

import application.junits.junitMathProvider_1;
import application.junits.junitMathProvider_2;
 
public class testRunner {
 
	public static void main(String[] args) {
		//This result object has many methods and it is very useful
		//Type result and press dot, all the methods will display
		//This statement is to load all type of results in the result object
		// add more classes to your test run schedule:
		Result result = JUnitCore.runClasses(junitMathProvider_1.class, junitMathProvider_2.class);
		//Here it is getting the run count from the result object
		System.out.println("Total number of tests " + result.getRunCount());
		//This is to get the failure count from the result object
		System.out.println("Total number of tests failed " + result.getFailureCount());
 
		for(Failure failure : result.getFailures())
		{	
			//This will print message only in case of failure
			System.out.println(failure.getMessage());
		}
		//This will print the overall test result in boolean type
		System.out.println(result.wasSuccessful());
	}
}