package com.lisasmith.week5;

/* 
* Requirement 1: Create an interface named Logger.
*/

public interface Logger {
	
	/*
	 * Requirement 2a:  Create void method Log, 
	 * 					which takes a String as an argument.
	 */
	public void Log(String log);	
	
	/*
	 * Requirement 2b:  Create void method Error,
	 * 					which takes a String as an argument.
	 */
	public void Error(String error);
	
}
