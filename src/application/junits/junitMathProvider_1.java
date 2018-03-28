package application.junits;

import static org.junit.Assert.*;
import org.junit.Test;

import application.mathProvider;


public class junitMathProvider_1 {
	//created a Class variable called provider of the type MathProvider to test MathProvider class. 
	mathProvider provider;

public junitMathProvider_1(){

	provider = new mathProvider();
	}


@Test
public void add()
{
	System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	int firstNumber = 10;
	int secondNumber = 20;
	assertEquals(firstNumber + secondNumber, provider.Add(firstNumber, secondNumber));
	System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
}

@Test
public void subtract()
{
	System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
    int firstNumber = 10;
    int secondNumber = 20;
	assertEquals(firstNumber - secondNumber, provider.Substract(firstNumber, secondNumber));
	System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
}

}
