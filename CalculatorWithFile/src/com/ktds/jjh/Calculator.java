package com.ktds.jjh;

public class Calculator {
	
	public void start() {
		int result = 10 + 70;
		
		String message = String.format("%d + %d = %d", 10, 20, result );
		System.out.println(message);
		
		
		
		FilleWriteHelper fileWriteHelper = new FilleWriteHelper();
		fileWriteHelper.log(message);
	}
	
	
	public static void main(String[] args) {
		
		new Calculator().start();
		
	}

}
