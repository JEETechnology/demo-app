package com.example.jacocojavademo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MessageParserTest {

    

	@Test
	void testGetMessage() {
	MessageParser messageParser = new MessageParser();
	messageParser.getMessage("random message");	
	assertEquals("empty", messageParser.getMessage(""));
	assertEquals("user1", messageParser.getMessage("user1"));
	}

}
