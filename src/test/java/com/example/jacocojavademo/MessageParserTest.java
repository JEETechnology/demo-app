package com.example.jacocojavademo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.jacocojavademo.calculator.SimpleCalculator;

class MessageParserTest {

    

	@Test
	void testGetMessage() {
	EmailSender emailSender = new EmailSender();
	MessageParser messageParser = new MessageParser();
	messageParser.getMessage("random message");	
	messageParser.getMessage(null);
	assertEquals("empty", messageParser.getMessage(""));
	assertEquals("user1", messageParser.getMessage("user1"));
	assertEquals("empty", messageParser.getMessage(null));
	assertEquals("empty", messageParser.getMessage(new String()));
	
	
	
	SimpleCalculator simpleCalculator = new SimpleCalculator();
	int res=simpleCalculator.add(2, 2);
	assertEquals(4, res);
	assertEquals(5, simpleCalculator.add(3, 2));
	}

}
