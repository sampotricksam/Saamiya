/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/TemperatureConversion.java
 *  Execution:    java -cp bin com.bridgelabz.util.TemperatureConversion 
 *  
 *  Purpose: To find temperature in Celsius or vice versa
 *
 *  @author  Saamiya
 *  @version 1.0
 *  @since   12-08-2017
 *
 ******************************************************************************/
/*PACKAGE NAMING STYLE*/
package com.bridgelabz.util;

import java.lang.Integer;
import java.util.Scanner;

public class TemperatureConversion{
	public static void main(String[] args) {
		 
   		//Scanner takes an input stream object.
      	//Scanner sc = new Scanner(System.in);

      	/*parse is a method which take a string(input) as an argument and convert in double
		* tempCel variable stores the temperature in celsius entered by the user as the input
		* tempFar variable stores the temperature in fahrenheit entered by the user as the input
		*/
      	int tempCel=Integer.parseInt(args[0]);
      	int tempFar=Integer.parseInt(args[1]);

      	/*display the temperature entered in celsius and fahrenheit*/
      	System.out.println();
      	System.out.println("The temperature entered in Celsius is : " + tempCel + " Celsius ");
      	System.out.println("The temperature entered in Fahrenheit is : " + tempFar + " Fahrenheit ");
      	System.out.println();

      	/*Display the choices to be entered by the user*/
      	System.out.println(" MENU ");
      	System.out.println(" 1. Celsius to Fahrenheit ");
      	System.out.println(" 2. Fahrenheit to Celsius ");
      	System.out.println();

      	System.out.println("Enter your choice\n");
      	/*Accept an integer and stored in result variable*/
      	//Scanner takes an input stream object.
 		Scanner scan=new Scanner (System.in);
 		int result=scan.nextInt();     	
       	System.out.println("The entered choice is " + result);
      	
      	switch(result){
      		case 1: int resultFar=(tempCel*9/5+32);
      		System.out.println("The " + tempCel + " in Celsius is converted to " + resultFar + " Fahrenheit ");
      		break;

      		case 2: int resultCel=(tempFar-32)*5/9;
      		System.out.println("The " + tempFar + " in Fahrenheit is converted to " + resultCel + " Celsius ");
      		break;

      		default : System.out.println(" Invalid choice ");
      	}
	}
}