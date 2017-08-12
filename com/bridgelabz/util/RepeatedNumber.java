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
import java.util.Scanner;
public class RepeatedNumber{
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		//define array for storing the nos
		int a[]=new int[100];
		System.out.println("Enter the no. of elements:");
		int no=s.nextInt();
		System.out.println("Enter the elements of array:");
		//store the elements of array
		for(int i=0;i<no;i++){
			a[i]=s.nextInt(); 
		}
		//compare and check wheater nos are same or not
		for(int i=0;i<no;i++){
			for(int j=i+1;j<no;j++){	
				if(a[i]==a[j]){
					System.out.println(a[j]+ " is a duplicte no.");
				}
			}
		}		
	}
}	