import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class FactorsTest {
	
	@Test
	public void testJUnit() {
		assertTrue("blah", true);
	}

	@Test
	public void testOne() {
		assertEquals(list(), Factors.generateFactors(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals(list(2), Factors.generateFactors(2));
	}
	
	private ArrayList<Integer> list(int... inta) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i : inta) {
			ret.add(i);
		}
		return ret;
	}
}
