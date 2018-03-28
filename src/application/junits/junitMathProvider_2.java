package application.junits;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
//package Application.UnitTests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import application.mathProvider;
 
public class junitMathProvider_2 {
		mathProvider provider;	
 
	public junitMathProvider_2(){
		provider = new mathProvider();
	};
 
	@Test
	public void multiply()
	{
		System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	    int firstNumber = 10;
	    int secondNumber = 20;
		assertEquals(firstNumber * secondNumber, provider.Multiply(firstNumber, secondNumber));
		System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
}