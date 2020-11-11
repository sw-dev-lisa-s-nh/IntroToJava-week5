package com.lisasmith.week5;

/* 
 * Requirement 3a:  Create the Asterisk Logger class that implements the Logger interface
 */

public class AsteriskLogger implements Logger {


	/*
	 * Requirement 4:  
	 * The log method on the AsteriskLogger should print out the String it receives
	 * between 3 asterisks on either side of the String.
	 * 	(e.g. if the String pass in is "Hello", then it should print out 
	 * 			"***Hello***" to the console.			
	 */
	
	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
	}

	/*
	 * Requirement 5:  
	 * The error method on the AsteriskLogger should print out the String it receives
	 * inside a box of asterisks, with the String preceded by the wordb"ERROR:".
	 * For example:  if "Hello" is the argument, the following should be printed:
	 *			***********  
	 * 			***Hello*** 
	 *			***********  	
	 */
	
	@Override
	public void Error(String error) {
		String s1 = "***Error: ";
		String s2 = "***";
		int counter = s1.length() + s2.length() + error.length();
		for (int i=0; i<counter; i++) {
			System.err.print("*");
		}
		System.err.println();
		System.err.println("***Error: "+ error + "***");
		
		for (int i=0; i<counter; i++) {
			System.err.print("*");
		}
		System.err.println();
	}

}
