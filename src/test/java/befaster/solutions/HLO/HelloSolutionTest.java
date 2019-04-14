package befaster.solutions.HLO;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloSolutionTest {
	HelloSolution hello;
	@Before
    public void setUp() {

        hello = new HelloSolution();
    }
	
	@Test
	public void test() {
		String expected = "Hello, World!";
		assertEquals(expected, hello.hello("Shirisha"));
	}

}

