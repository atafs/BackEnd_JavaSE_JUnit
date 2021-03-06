package model;

import static org.junit.Assert.*;
import interfaces.Greeting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {

	//ATTRIBUTES
	private Greeting greeting;

	@Before
	public void instantiate_setup() {
		System.err.println("PRINT: setup");
		greeting = new GreetingImpl();
	}
	
	@Test
	public void greetShouldReturnValidOutput() {
		System.out.println("PRINT: greetShouldReturnValidOutput");
		String result = greeting.greet("Junit");
		
		//ASSERT
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void greetShouldThrowException_For_NameIsNull() {
		System.out.println("PRINT: greetShouldThrowException_For_NameIsNull");
		greeting.greet(null);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void greetShouldThrowException_For_NameIsBlank() {
		System.out.println("PRINT: greetShouldThrowException_For_NameIsBlank");
		greeting.greet("");
	}
	
	@After
	public void instantiate_tearDown() {
		System.err.println("PRINT: tearDown");
		greeting = null;
	}
	

	

	


	 

}
