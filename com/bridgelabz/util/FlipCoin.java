/******************************************************************************
 *  Compilation:  javac -d bin FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.util.FlipCoin 
 *  
 *  Purpose: Determines whether or not month and day is SpringSeason.
 *
 *  @author  Saamiya
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
/*PACKAGE NAMING STYLE*/
package com.bridgelabz.util;
 public class FlipCoin{
 	public static void main(String[] args) {
 		/*Math.random() returns a value between 0.0 to 1.0
 		* so it is heads or tails 50% of the time
 		*/

 		if(Math.random()<0.5){
 			System.out.println("Heads");
 		}
 		else{
 			System.out.println("Tails");
 		}
 	}
 }
