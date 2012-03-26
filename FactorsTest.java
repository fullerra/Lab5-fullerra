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
		assertEquals(new ArrayList<Integer>(), Factors.generateFactors(1));
	}
}
