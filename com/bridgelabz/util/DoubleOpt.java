/******************************************************************************
 *  Compilation:  javac -d bin DoubleOpt.java
 *  Execution:    java -cp bin com.bridgelabz.util.DoubleOpt m n 
 *  
 *  Purpose: Performs Arithmetic operation on double.
 *
 *  @author  Saamiya
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
/*PACKAGE NAMING STYLE*/
package com.bridgelabz.util;

import java.lang.Double;
import java.lang.ArithmeticException;

public class DoubleOpt{
	public static void main(String[] args) {
		/*parse is a method which take a string(input) as an argument and convert in double
		* mInputNumber variable stores the number entered by the user as the input
		* nInputNumber variable stores the number entered by the user as the input
		*/

		double mInputNumber=Double.parseDouble(args[0]);
		double nInputNumber=Double.parseDouble(args[1]);
		/*Performs following arithmetic operations ie '+,*,/,%'*/
		double sum=mInputNumber+nInputNumber;
		double product=mInputNumber*nInputNumber;
		double quotient=mInputNumber/nInputNumber;
		double remainder=mInputNumber%nInputNumber;
		/*Prints the output*/
		System.out.println("The addition of entered input " + mInputNumber + " + " + nInputNumber + " = " +sum);
		System.out.println("The product of entered input " + mInputNumber + " * " + nInputNumber + " = " +product);
		System.out.println("The quotient of entered input " + mInputNumber + " / " + nInputNumber + " = " +quotient);
		System.out.println("The remainder of entered input " + mInputNumber + " % " + nInputNumber + " = " +remainder);

		System.out.println();
		/*Performs sine and logarithm function and prints the output*/
		System.out.println("sin(pi/2) = " + Math.sin(Math.PI/2));
		System.out.println("log(e) = " + Math.log(Math.E));	
	}	
}

/*OUTPUT 
* C:\Users\samiya\Desktop\work\Saamiya>javac -d bin com/bridgelabz/util/DoubleOpt.java

* C:\Users\samiya\Desktop\work\Saamiya>java -cp bin com.bridgelabz.util.DoubleOpt 10 15
* The addition of entered input 10.0 + 15.0 = 25.0
* The product of entered input 10.0 * 15.0 = 150.0
* The quotient of entered input 10.0 / 15.0 = 0.6666666666666666
* The remainder of entered input 10.0 % 15.0 = 10.0
*
* sin(pi/2) = 1.0
* log(e) = 1.0
*/