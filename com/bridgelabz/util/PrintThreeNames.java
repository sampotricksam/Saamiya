/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PrintThreeNames.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrintThreeNames
 *  
 *  Purpose: Print three names in reverse order.
 *
 *  @author  Saamiya
 *  @version 1.0
 *  @since   12-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;


public class PrintThreeNames{	
	
		public static void main(String[] args) {
			//Scanner scan = new Scanner (System.in);
			String firstName,secondName,thirdName;
		/*
		* Accept three strings from user
		*/
			firstName=args[0];
			secondName=args[1];
			thirdName=args[2];
		/*
		* Print string in reverse format
		*/
		
		System.out.println("Hi\t"+ thirdName + " \t  " + secondName + " \t " + firstName);
	}
}
