/******************************************************************************
 *  Compilation:  javac -d bin LeapYear.java
 *  Execution:    java -cp bin com.bridgelabz.util.LeapYear n
 *  
 *  Purpose: Determines whether or not year is LeapYear.
 *
 *  @author  Saamiya
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
/*PACKAGE NAMING STYLE*/
package com.bridgelabz.util;

import java.lang.Integer;

public class LeapYear{
	public static void main(String[] args) {
		/*parse is a method which take a string(input) as an argument and convert in double
		* year variable stores the input entered by the user
		*/
		int year=Integer.parseInt(args[0]);

		/*A Boolean value is one with two choices: true or false, yes or no, 1 or 0.*/
		boolean IsLeapYear;

		/*Divisible by 4*/
		IsLeapYear=(year%4==0);

		/*Divisible by 4 and not 100*/
		IsLeapYear=IsLeapYear && (year%100!=0);

		/*Divisible by 4 and not 100 unless divisible by 400*/
		IsLeapYear=IsLeapYear|| (year%400==0);

		/*prints whether it is leapyear or not*/
		System.out.println(IsLeapYear);	
	}	
}

/*OUTPUT

* C:\Users\samiya\Desktop\work\Saamiya>javac -d bin com/bridgelabz/util/LeapYear.java
* C:\Users\samiya\Desktop\work\Saamiya>java -cp bin com.bridgelabz.util.LeapYear 2100
* false
* C:\Users\samiya\Desktop\work\Saamiya>java -cp bin com.bridgelabz.util.LeapYear 2000
* true
*/