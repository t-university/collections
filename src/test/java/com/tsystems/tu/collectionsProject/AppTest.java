package com.tsystems.tu.collectionsProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Unit test for simple App.
 */
@RunWith(Parameterized.class)
public class AppTest {

	private int m1;
	private int m2;

	public AppTest(int p1, int p2) {
		m1 = p1;
		m2 = p2;
	}

//	@Test
//	public void shouldAnswerWithTrue() {
//		assertTrue(true);
//	}

//	@Test
//	public void positiveMultiplyTest() {
//		App calculator = new App();
//		assertEquals("50*3 = 150", 150, calculator.multiply(3, 50));
//	}

	@Test(expected = IllegalArgumentException.class)
	public void negativeArgument() {
		App calculator = new App();
		int mult = calculator.multiply(-m1, m2);
	}

//    @Test
//    public void failTest() {
//    	App calculator = new App();
//        assertEquals("50*3 should be 155", 155, calculator.multiply(3, 50));
//    }

	// creates the test data
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 1, 2 }, { 5, 3 }, { 121, 4 } };
		return Arrays.asList(data);
	}

	@Test
	public void testMultiplyArray() {
		App tester = new App();
		assertEquals("Result", m1 * m2, tester.multiply(m1, m2));
	}

}
