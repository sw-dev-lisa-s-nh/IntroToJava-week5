package com.lisasmith.week5;


/* 
 * Requirement 3b:  Create the SpacedLogger class that implements the Logger interface
 */

public class SpacedLogger implements Logger {

	
	
	/*
	 * Requirement 6 & 7:  
	 * Add spaces between each character of the String argument 
	 * passed into the method.  The log method should print the
	 * String passed in with a space between each character.
	 *   	(e.g. Hello --> "H e l l o")
	 * 					
	 */
	
	@Override
	public void Log(String log) {
		for (int i = 0; i<log.length(); i++) {
			System.out.print(log.charAt(i) + " ");
			
		}
		System.out.println();
	}

	
	/*
	 * Requirement 6 & 8:  
	 * Add spaces between each character of the String argument 
	 * passed into the method.  The error method should add "ERROR: " 
	 * preceding the spaced out input.   
	 * 	(e.g. Hello --> "ERROR: H e l l o")
	 */
	
	@Override
	public void Error(String error) {	
		System.err.print("ERROR: ");
		for (int i = 0; i<error.length(); i++) {
			System.err.print(error.charAt(i) + " ");
			
		}
		System.err.println();
	}

}
