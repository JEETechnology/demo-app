package com.example.jacocojavademo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.jacocojavademo.calculator.SimpleCalculator;




class SimpleCalculatorTest {
	


	@Test
	public void testAdd() {
		SimpleCalculator simpleCalculator = new SimpleCalculator();
		assertEquals(4, simpleCalculator.add(2, 2));
		assertEquals(8, simpleCalculator.add(3, 5));
		
	}
	
	@Test
	public void testSubtract() {
		SimpleCalculator simpleCalculator = new SimpleCalculator();
		assertEquals(2, simpleCalculator.subtract(5, 3));
		assertEquals(8, simpleCalculator.subtract(8, 0));
		
	}
	

}
