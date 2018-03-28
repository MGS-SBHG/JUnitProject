package application.junits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
 
/*
 * says to the Junit runner  run the class with class called Suite. 
 * Suite class in the Junit framework helps us run a build 
 * test by adding multiple test classes.
 */
 
	@RunWith(Suite.class)
	@Suite.SuiteClasses({
		junitMathProvider_1.class,
		junitMathProvider_2.class    
	})
	
public class TestSuite {

}
