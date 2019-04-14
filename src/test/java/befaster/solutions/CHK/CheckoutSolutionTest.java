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
		int expected = 160;
		int actual = chkSolution.checkout("EEEBEB");
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void positiveResult() {
		int expected = 200;
		int actual = chkSolution.checkout("AAAAA");
		assertEquals(expected, actual);
		
	}
	@Test
	public void positiveResultA() {
		int expected = 130;
		int actual = chkSolution.checkout("AAA");
		assertEquals(expected, actual);
		
	}
	@Test
	public void positiveResultMultiple() {
		int expected = 380;
		int actual = chkSolution.checkout("AAAAAAAAA");
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

