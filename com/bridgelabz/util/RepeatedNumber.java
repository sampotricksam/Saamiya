/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/RepeatedNumber.java
 *  Execution:    java -cp bin com.bridgelabz.util.RepeatedNumber
 *  
 *  Purpose: To find logic for repeated number.
 *
 *  @author  Saamiya
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
/*PACKAGE NAMING STYLE*/
package com.bridgelabz.util;

public class RepeatedNumber{
	public static void main(String[] args) {
		int[] arr={1,2,3,2,5};
		for (int i=0;i<arr.length-1 ;i++ ) {
			for (int j=i+1;j<arr.length ;j++ ) {
				if(arr[i]==arr[j]){
					System.out.println("Repeatednumber is " +arr[j]);
				}
				
			}
			
		}
	}
}