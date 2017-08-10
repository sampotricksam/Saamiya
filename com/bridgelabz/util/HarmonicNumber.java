/******************************************************************************
 *  Compilation:  javac -d bin HarmonicNumber.java
 *  Execution:    java -cp bin com.bridgelabz.util.HarmonicNumber n 
 *  
 *  Purpose: 
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

	/*returns 1/1 +1/2 +1/3...+1/n*/
	public static double Harmonic(int n){
		double sum=0.0;
		for(int i=1;i<=n;i++){
			sum+=1.0/i;
		}
		return sum;
	}

	public static void main(String[] args){
		for(int i=0;i<args.length;i++){
			int arg=Integer.parseInt(args[i]);
			double value=Harmonic(arg);
			System.out.println(value);
		}
	}
}