package myTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddToWallet {

	@Test
	public void test() {
		InterestCalc test = new InterestCalc();
		double result = myTest.InterestCalc.AddToWallet(10, 5);
		assertEquals(15, result, 0);
	}

}
