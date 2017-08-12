 /******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/SecondLargest_Smallest.java
 *  Execution:    java -cp bin com.bridgelabz.util.SecondLargest_Smallest
 *  
 *  Purpose: To find Second largest and second smallest element from unsorted array and without sorting array.
 *
 *  @author  Saamiya
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
/*PACKAGE NAMING STYLE*/
package com.bridgelabz.util;
import java.util.Scanner;
public class SecondLargest_Smallest{
	public static void main(String[] args) {
		int nNumber,temp;

		//Scanner takes an input stream object
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no of elements you want in array\n");
		nNumber=sc.nextInt();
		int a[]=new int[nNumber];
		System.out.println("\nEnter all the elements\n");
		for (int i=0;i<nNumber ;i++) {
			a[i]=sc.nextInt();             //prints the elements entered by the user			
		}
		for (int i=0;i<nNumber ;i++ ) {
			for (int j=i+1;j<nNumber ;j++ ) {
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];				//satisfies the condition and swap and stores 
					a[j]=temp;
				}
			}
		}

		//prints the output
		System.out.println("Second largest number is " + a[nNumber-2]);
		System.out.println("Second smallest number is " + a[1]);
	}
}