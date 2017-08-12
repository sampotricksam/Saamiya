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
/*PACKAGE NAMING STYLE*/
package com.bridgelabz.util;
import java.util.Scanner;

public class PrintThreeNames{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		/*
		* Accept three strings from user
		*/
		System.out.println("Enter three names:");
		String firstName = scan.next();
		String secondName = scan.next();
		String thirdName = scan.next();
		
		/*
		* Print string in reverse format
		*/
		System.out.println("Hi\t"+ thirdName + " \t  " + secondName + " \t " + firstName);
	}
}