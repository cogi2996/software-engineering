package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junitTest.Problem.Calculator;

public class CalculatorTest {
	private Calculator calculator;
	
	@BeforeEach
	public void setUp() {
		Problem problem = new Problem();
		this.calculator = problem.new Calculator(3, 2);
	}

	@Test
	public void testAddition() {
		int actResult = calculator.sum();
		// 3 + 2 = 5
		int expResult = 5;
		assertEquals(expResult, actResult);
	}
	
	@Test
	public void testSubtraction() {
		int actResult = calculator.subtract();
		// 3 - 2 = 1
		int expResult = 1;
		assertEquals(expResult, actResult);
	}
}