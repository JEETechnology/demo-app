package com.example.jacocojavademo;

public class MessageParser {
	
	public String getMessage(String message) {
		if (message == null || message.trim().isBlank()) {
			return "empty";
			}
		else {
			return message;
		}
	}

}
