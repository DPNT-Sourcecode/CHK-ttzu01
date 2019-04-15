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


	@Test public void test() { int expected = 160; int actual =
			chkSolution.checkout("BEBEEE"); assertEquals(expected, actual);

	}

	@Test public void positiveResult() { int expected = 200; int actual =
			chkSolution.checkout("AAAAA"); assertEquals(expected, actual);

	}

	@Test 
	public void positiveResultA() { 
		int expected = 130; 
		int actual =chkSolution.checkout("AAA"); 
		assertEquals(expected, actual);

	}

	@Test public void positiveResult1() { 
		int expected = 160; 
		int actual =chkSolution.checkout("EEEEBB"); 
		assertEquals(expected, actual);

	}


	@Test 
	public void positiveResultMultiple() { 
		int expected = 380; 
		int actual =chkSolution.checkout("AAAAAAAAA"); 
		assertEquals(expected, actual);

	}

	@Test
	public void positiveResultE() {
		int expected = 80;
		int actual = chkSolution.checkout("EE");
		assertEquals(expected, actual);

	}

	@Test
	public void positiveResultF() {
		int expected = 20;
		int actual = chkSolution.checkout("FF");
		assertEquals(expected, actual);

	}
	
	@Test
	public void positiveResultF1() {
		int expected = 20;
		int actual = chkSolution.checkout("FFF");
		assertEquals(expected, actual);

	}
	
	@Test
	public void positiveResultF2() {
		int expected = 120;
		int actual = chkSolution.checkout("EEBFFFFF");
		assertEquals(expected, actual);

	}
	
	@Test
	public void positiveResultF3() {
		int expected = 120;
		int actual = chkSolution.checkout("EEFFFFF");
		assertEquals(expected, actual);

	}
	
	@Test
	public void positiveResultF4() {
		int expected = 170;
		int actual = chkSolution.checkout("AAAFFFFF");
		assertEquals(expected, actual);

	}
	
	@Test
	public void positiveResultF5() {
		int expected = 270;
		int actual = chkSolution.checkout("FFAAAAAA");
		assertEquals(expected, actual);

	}
	
	@Test
	public void positiveResultH() {
		int expected = 90;
		int actual = chkSolution.checkout("HHHHHHHHHHH");
		assertEquals(expected, actual);

	}
	
	@Test
	public void positiveResultV() {
		int expected = 220;
		int actual = chkSolution.checkout("VVVVV");
		assertEquals(expected, actual);

	}
	
	@Test
	public void positiveResultU() {
		int expected = 120;
		int actual = chkSolution.checkout("UUUU");
		assertEquals(expected, actual);

	}
	
	@Test
	public void positiveResultR() {
		int expected = 150;
		int actual = chkSolution.checkout("RRR");
		assertEquals(expected, actual);

	}
	
	@Test
	public void positiveResultQ() {
		int expected = 80;
		int actual = chkSolution.checkout("QQQ");
		assertEquals(expected, actual);

	}
	
	@Test
	public void positiveResultP() {
		int expected = 200;
		int actual = chkSolution.checkout("PPPPP");
		assertEquals(expected, actual);

	}
	
	@Test public void negativeResult() { int expected = -1; int actual =
			chkSolution.checkout("ghj"); assertEquals(expected, actual); }

	@Test public void illegalInput() { int expected = 135; int actual =
			chkSolution.checkout("AAI"); assertEquals(expected, actual); }

}




