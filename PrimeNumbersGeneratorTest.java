package PrimeNumbersGeneration;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeNumbersGeneratorTest {

	@Test
	public void testJUnit() {
		assertTrue("blah", true);
	}
	
	@Test
	public void testOne() {
		assertEquals(list(), PrimeNumbersGenerator.generatePrimeNumbers(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals(list(), PrimeNumbersGenerator.generatePrimeNumbers(2));
	}
	
	@Test
	public void testThree() {
		assertEquals(list(2), PrimeNumbersGenerator.generatePrimeNumbers(3));
	}
//	
//	@Test
//	public void testFour() {
//		assertEquals(list(2, 3), PrimeNumbersGenerator.generatePrimeNumbers(4));
//	}
	
	private ArrayList<Integer> list(int... inta) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i : inta) {
			ret.add(i);
		}
		return ret;
	}

}
