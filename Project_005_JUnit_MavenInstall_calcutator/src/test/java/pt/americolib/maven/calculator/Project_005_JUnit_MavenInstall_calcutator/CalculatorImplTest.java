package pt.americolib.maven.calculator.Project_005_JUnit_MavenInstall_calcutator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorImplTest {

	//ASSERT EQUALS
	@Test
	public void addShouldReturnAResult() {
		//EXPECTED
		Calculator c = new CalculatorImpl();
		int result = c.add(10, 20);
	
		//ASSERT
		assertEquals(30, result);
	}

}
