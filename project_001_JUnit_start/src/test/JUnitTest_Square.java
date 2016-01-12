package test;

import static org.junit.Assert.*;

import org.junit.Test;

import type.Square;

public class JUnitTest_Square {
	
	@Test
	public void testSquare() {
		Square test = new Square();
		int output = test.square(5);
		assertEquals(25, output);
	}
	
	@Test
	public void testCountA() {
		Square test = new Square();
		int output = test.countA("alphabet");
		assertEquals(2, output);
	}
	
	

}
