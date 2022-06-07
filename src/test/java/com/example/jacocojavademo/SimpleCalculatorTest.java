package com.example.jacocojavademo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimpleCalculatorTest {
	
	private SimpleCalculator simpleCalculator;

	@Test
	public void testAdd() {
		simpleCalculator = new SimpleCalculator();
		assertEquals(4, simpleCalculator.add(2, 2));
		assertEquals(5, simpleCalculator.add(3, 5));
		
	}

}
