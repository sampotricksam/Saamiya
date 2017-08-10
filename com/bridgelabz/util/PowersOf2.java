/******************************************************************************
 *  Compilation:  javac -d bin FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.util.FlipCoin 
 *  
 *  Purpose: Simulate a fair coin flip and print out "heads" or "tails".
 *
 *  @author  Saamiya
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
/*PACKAGE NAMING STYLE*/
package com.bridgelabz.util;
 import java.lang.Integer;
public class PowersOf2{
	public static void main(String[] args) {
		 int mInputNumber=Integer.parseInt(args[0]); //read in one command line argument
		 int i=0;
		 int powerof2=1;

		 //repeats until i equals n
		 while(i<=mInputNumber){
		 	System.out.println(i + " " + powerof2);//print out the power of 2
		 	powerof2=2*powerof2; //double to get next one
		 	i=i+1;
		 }

		
	}
}