package com.example.jacocojavademo;

public class MessageParser {
	
	public void getMessage(String message) {
		if (message == null || message.trim().isBlank() || message.trim().isEmpty()) {
			System.out.println("Message is empty");
			}
		else {
			System.out.println("message parsed.");
		}
	}

}
