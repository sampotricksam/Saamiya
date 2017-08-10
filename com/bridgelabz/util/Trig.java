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

public class Trig{
	public static void main(String[] args) {
		
		double degree=Double.parseDouble(args[0]);
		double radians=Math.toRadians(degree);

		double sine=Math.sin(radians);
		System.out.println("sin(" + degree + " ) = " + sine);

		double cosine=Math.cos(radians);
		System.out.println("sin(" + degree + " ) = " + cosine);

		double tan=Math.tan(radians);
		System.out.println("sin(" + degree + " ) = " + tan);

		System.out.println(sine + " / " + cosine + " = " + sine/cosine);

		double radian=sine*sine + cosine*cosine;
		System.out.println(sine*sine + " + " + cosine*cosine + " = " +radian);
	}
}
