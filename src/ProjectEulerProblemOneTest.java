import static org.junit.Assert.*;

import org.junit.Test;


public class ProjectEulerProblemOneTest {

	@Test
	public void testMyFunction() {
		int[] expectedOutcome = {3, 5, 6, 9};
		int testInput= 10;	
		MyObject myObject = new MyObject();
		assertArrayEquals(expectedOutcome, myObject.myFunction(testInput));
	}
	@Test
	public void testMySumFunction() {
		int expectedOutcome = 23;
		int testInput= 10;	
		MyObject myObject = new MyObject();
		assertEquals(expectedOutcome, myObject.mySumFunction(testInput));
	}
	@Test
	public void testMySumFunction2() {
		int expectedOutcome = 23;
		int testInput= 1000000;	
		MyObject myObject = new MyObject();
		assertEquals(expectedOutcome, myObject.mySumFunction(testInput));
	}


}
