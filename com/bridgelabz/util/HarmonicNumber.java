/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/HarmonicNumber.java
 *  Execution:    java -cp bin com.bridgelabz.util.HarmonicNumber n 
 *  
 *  Purpose: Prints the harmonic number in the form H=1/1+1/2+1/3+1/4+...+1/n
 *
 *  @author  Saamiya
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
/*PACKAGE NAMING STYLE*/
package com.bridgelabz.util;
import java.lang.Double;

public class HarmonicNumber{
	public static void main(String[] args) {
		/*parse is a method which take a string(input) as an argument and convert in double
		* InputNumber variable stores the number entered by the user as the input
		*/
		int InputNumber=Integer.parseInt(args[0]);
		System.out.println(" HarmonicNumber = ");
		for(int i=1;i<=InputNumber;i++){
			System.out.print(" 1/  " + i);
			if(i<InputNumber){
				System.out.print(" + ");
			}
		}
	}
}		

	/*returns 1/1 +1/2 +1/3...+1/n
	public static double Harmonic(int n){
		double sum=0.0;
		for(int i=1;i<=n;i++){
			sum+=1.0/i;
		}
		return sum;
	}

	public static void main(String[] args){
		/*args.length is the length of the arguments passed to the program
		for(int i=0;i<args.length;i++){
			int arg=Integer.parseInt(args[i]);
			double value=Harmonic(arg);
			System.out.println(value);
		}*/


