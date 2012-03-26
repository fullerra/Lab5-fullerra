import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PrimeFactorsTest {
	
	@Test
	public void testJUnit() {
		assertTrue("blah", true);
	}

	@Test
	public void testOne() {
		assertEquals(list(), PrimeFactors.generateFactors(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals(list(2), PrimeFactors.generateFactors(2));
	}
	
	@Test
	public void testThree() {
		assertEquals(list(3), PrimeFactors.generateFactors(3));
	}
	
	@Test
	public void testFour() {
		assertEquals(list(2, 2), PrimeFactors.generateFactors(4));
	}
	
	@Test
	public void testSix() {
		assertEquals(list(2, 3), PrimeFactors.generateFactors(6));
	}
	
	@Test
	public void testEight() {
		assertEquals(list(2, 2, 2), PrimeFactors.generateFactors(8));
	}
	
	@Test
	public void testNine() {
		assertEquals(list(3, 3), PrimeFactors.generateFactors(9));
	}
	
	private ArrayList<Integer> list(int... inta) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i : inta) {
			ret.add(i);
		}
		return ret;
	}
}
