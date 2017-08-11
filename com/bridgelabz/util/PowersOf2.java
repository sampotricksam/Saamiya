/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PowersOf2.java
 *  Execution:    java -cp bin com.bridgelabz.util.PowersOf2 
 *  
 *  Purpose: Prints a table of powers of 2.
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
		 	/*if(n>0 && n<31){
		 		for( ; i<=n;i++){
		 			System.out.println("PowersOf2 " + i + " " + 2^n + is Math.pow(2,i));
		 		}
		 	}*/
		}
	}

/*OUTPUT
* C:\Users\samiya\Desktop\Saamiya>javac -d bin com/bridgelabz/util/PowersOf2.java
*
* C:\Users\samiya\Desktop\Saamiya>java -cp bin com.bridgelabz.util.PowersOf2 5
* 0 1
* 1 2
* 2 4
* 3 8
* 4 16
* 5 32
*/