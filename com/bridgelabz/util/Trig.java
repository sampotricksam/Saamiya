/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Trig.java
 *  Execution:    java -cp bin com.bridgelabz.util.Trig n 
 *  
 *  Purpose: To iilustrate various trignometric functions in Math library.
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
		
		/*parse is a method which take a string(input) as an argument and convert in double
        * degree variable stores the number entered by user as input
        */
		double degree=Double.parseDouble(args[0]);

		//prints degree
		System.out.println("You have entered Degree as " + degree);
		double radians=Math.toRadians(degree);

		double sine=Math.sin(radians);
		System.out.println("sin(" + degree + " ) = " + sine);

		double cosine=Math.cos(radians);
		System.out.println("cos(" + degree + " ) = " + cosine);

		double tan=Math.tan(radians);
		System.out.println("tan(" + degree + " ) = " + tan);

		System.out.println("The value of tan ie " + sine + " / " + cosine + " = " + sine/cosine);

		double radian=sine*sine + cosine*cosine;
		System.out.println("The value of entered input ie " + sine*sine + " + " + cosine*cosine + " = " +radian);
	}
}

/*OUTPUT
* C:\Users\samiya\Desktop\Saamiya>javac -d bin com/bridgelabz/util/Trig.java
*
* C:\Users\samiya\Desktop\Saamiya>java -cp bin com.bridgelabz.util.Trig 45
* You have entered Degree as 45.0
* sin(45.0 ) = 0.7071067811865475
* cos(45.0 ) = 0.7071067811865476
* tan(45.0 ) = 0.9999999999999999
* The value of tan ie 0.7071067811865475 / 0.7071067811865476 = 0.9999999999999999
* The value of entered input ie 0.4999999999999999 + 0.5000000000000001 = 1.0
*/