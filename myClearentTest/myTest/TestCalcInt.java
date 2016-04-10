package myTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalcInt {

	@Test
	public void testInterest() {
		
		InterestCalc test = new InterestCalc();
		double result = myTest.InterestCalc.CalculateInterest(100, .1);
		assertEquals(10, result, 0);
		
	}

}
