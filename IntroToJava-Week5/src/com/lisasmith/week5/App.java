package com.lisasmith.week5;

import java.util.Date;

public class App {
	
	// static Logger logger;

	public static void main(String[] args) {

		/* 
		 * Requirement 9: Create a class named App that has a main method!
		 */
		
		System.out.println("-----------------------");
		System.out.println("Intro To Java -- Week 5");
		System.out.println("-----------------------");
		System.out.println();

		/*
		 * Requirement 10: In this class, instantiate an instance 
		 * 				   of each of your logger classes that implements 
		 * 				   the Logger Interface
		 */
		
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();	
		
		/*
		 * Requirement 11:  Test both methods (Log & Error) on both instances
		 * 					(asteriskLogger & spacedLogger), with Strings of 
		 * 					my choice.
		 * 
		 * 	(1) Initial Test Case: "Hello"
		 *  (2) Longer String (more than 5 characters):  "Buenos Dias"
		 *  (3) Actual Log Event:  using Date
		 *  (4) Actual Error Event:  Test .Error with an Error Message
		 */
	
	
		/*
		 * (1) Initial Test case -- "Hello"
		 */

		System.out.println("Requirement 11:");
		System.out.println("---------------");
		System.out.println();
		
		
		System.out.println();
		System.out.println("(1) Initial test using  \"Hello\"");
		System.out.println("-------------------------------");

		System.out.println("AsteriskLogger:");
		System.out.println("--------------");
		System.out.println();	
		asteriskLogger.Log("Hello");
		System.out.println();
		System.out.println();
		asteriskLogger.Error("Hello");
		System.out.println();
		
		System.out.println("SpacedLogger:");
		System.out.println("------------");
		System.out.println();
		spacedLogger.Log("Hello");
		System.out.println();
		System.out.println();
		spacedLogger.Error("Hello");		
		System.out.println();
		
		/*
		 * (2) Longer String -- Notice that the asterisks are printed 
		 * 						to match the length of the string.
		 */

		System.out.println();
		System.out.println("(2) Test using a longer string");
		System.out.println("------------------------------");		
		
		System.out.println("AsteriskLogger:");
		System.out.println("--------------");
		System.out.println();
		asteriskLogger.Log("Buenos Dias");
		System.out.println();
		System.out.println();
		asteriskLogger.Error("Buenos Dias");	
		System.out.println();
		
		System.out.println("SpacedLogger:");
		System.out.println("------------");
		System.out.println();
		spacedLogger.Log("Buenos Dias");
		System.out.println();
		System.out.println();
		spacedLogger.Error("Buenos Dias");	
		System.out.println();

		
		/*
		 * (3) Actual Log Event -- Notice that the asterisks are printed 
		 * 					   	   to match the length of the string.
		 */
				
		System.out.println();
		System.out.println("(3) Test using the Date");
		System.out.println("-----------------------");

		Date date = new Date();
		
		System.out.println("AsteriskLogger:");
		System.out.println("--------------");
		System.out.println();
		asteriskLogger.Log(date.toString());
		System.out.println();
		System.out.println();
		asteriskLogger.Error(date.toString());		
		System.out.println();

		System.out.println("SpacedLogger:");
		System.out.println("------------");
		System.out.println();
		spacedLogger.Log(date.toString());
		System.out.println();
		System.out.println();
		spacedLogger.Error(date.toString());
		System.out.println();
		
		/*
		 * (4) Actual Error Event -- Notice that the asterisks are printed 
		 * 					         to match the length of the string.
		 */	
		
		System.out.println();
		System.out.println("(4) Test .Error Methods using an error message");
		System.out.println("----------------------------------------------");

		/* 
		 * Variables created for (4) Test -- sum is never used
		 */
		int[] digits = {0,1,2,3,4,5,6,7,8,9};
		int index = 0;
		int sum = 0;
	
		/*
		 * This is a contrived error scenario -- I intentionally tried to access one index past the 
		 * last element of an array to force the try/catch to catch the exception.  
		 * 
		 * This is programmer's error, but done intentionally.  I wasn't sure how to get a test 
		 * case with a "real" exception, so I forced this by putting a index <= digits.length.  
		 * (NOTE:  to be coded correctly this should be index<digits.length) 
		 */
		
		
		
		/* 
		 * Contrived example:  sum of all of the entries in the digits array. 
		 * 					   This gives us a test case using an actual exception.
		 */
		System.out.println("AsteriskLogger:");
		System.out.println("--------------");
		System.out.println();
		System.out.println();	
	
		while (index<=digits.length) {
			try {
			 sum = digits[index++];
			} catch (Exception e){
			 asteriskLogger.Error(e.toString());
			} 
		}
		System.out.println();
		System.out.println();
		
		/* 
		 * Contrived example:  sum of all of the entries in the digits array. 
		 * 					   This gives us a test case using an actual exception.
		 */
		System.out.println("SpacedLogger:");
		System.out.println("------------");
		System.out.println();
		System.out.println();
		index = 0;
		sum = 0;		
		
		while (index<=digits.length) {
			try {
			 sum = digits[index++];
			} catch (Exception e){
			 spacedLogger.Error(e.toString());
			} 
		}
						
		
		System.out.println();
		System.out.println();
		
		System.out.println("------------------------------");
		System.out.println("End of Intro To Java -- Week 5");
		System.out.println("------------------------------");
	
		
		
	}

}
