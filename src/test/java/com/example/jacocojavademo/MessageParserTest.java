package com.example.jacocojavademo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MessageParserTest {

    

	@Test
	void testGetMessage() {
	MessageParser messageParser = new MessageParser();
	messageParser.getMessage("random message");	
	}

}
