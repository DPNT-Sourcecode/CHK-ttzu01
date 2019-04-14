package befaster.solutions.CHK;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CheckoutSolutionTest {
	
	CheckoutSolution chkSolution;
	@Before
    public void setUp() {

        chkSolution = new CheckoutSolution();
    }
	@Test
	public void test() {
		int expected = 190;
		int actual = chkSolution.checkout("AABBBD");
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void negativeResult() {
		int expected = -1;
		int actual = chkSolution.checkout("ghj");
		assertEquals(expected, actual);
	}

}

