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
		int expected = 195;
		int actual = chkSolution.checkout("AABEED");
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void positiveResult() {
		int expected = 330;
		int actual = chkSolution.checkout("AAAAAAAA");
		assertEquals(expected, actual);
		
	}
	@Test
	public void positiveResultE() {
		int expected = 80;
		int actual = chkSolution.checkout("EE");
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void negativeResult() {
		int expected = -1;
		int actual = chkSolution.checkout("ghj");
		assertEquals(expected, actual);
	}
	
	@Test
	public void illegalInput() {
		int expected = -1;
		int actual = chkSolution.checkout("AAI");
		assertEquals(expected, actual);
	}

}




