 /******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/IntOpt.java
 *  Execution:    java -cp bin com.bridgelabz.util.IntOpt a b c
 *  
 *  Purpose: Performs the given operations according to the precedence
 *
 *  @author  Saamiya
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
 
/*PACKAGE NAMING STYLE*/
package com.bridgelabz.util;
import java.util.Scanner;
public class IntOpt{
   public static void main(String[] args) {

   	//Scanner takes an input stream object.
      Scanner sc = new Scanner(System.in);

      //accept an integer and store it in the variable firstNumber, secondNumber and thirdNumber
      System.out.print("Enter first number: ");
      int firstNumber = sc.nextInt();
      System.out.print("Enter second number: ");
      int secondNumber = sc.nextInt();
      System.out.print("Enter third number: ");
      int thirdNumber = sc.nextInt();

      //Performs and prints the ouput
      int firstOpt=firstNumber+secondNumber*thirdNumber;
      System.out.println("The result is " + firstOpt);
      int secondOpt=firstNumber*secondNumber+thirdNumber;
      System.out.println("The result is " + secondOpt);
      int thirdOpt=thirdNumber+firstNumber/secondNumber;
      System.out.println("The result is " + thirdOpt);
      int fourthOpt=firstNumber%secondNumber+thirdNumber;
      System.out.println("The result is" + fourthOpt);

   }
} 