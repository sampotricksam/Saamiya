/******************************************************************************
 *  Compilation:  javac -d bin PrimeNumber.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeNumber 
 *  
 *  Purpose: Determines whether or not n is prime.
 *
 *  @author  Saamiya
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;


import java.util.Scanner;


public class PrimeNumber{

        public static void main(String args[]){ 
 		int mInputNumber,IsPrime;

          	Scanner sc=new Scanner(System.in);
          	System.out.println("Enter the number\n");
          	mInputNumber=sc.nextInt();
		if(mInputNumber==1||mInputNumber==0){
			System.out.println("entered number is not prime");
		}

          	for(IsPrime=2;IsPrime<=mInputNumber;IsPrime++){

                	if(mInputNumber%IsPrime==0){
                        	System.out.println("entered number " +mInputNumber+ " is not a prime number");
               			break;
                	}
                	else{
                        	System.out.println("entered number " +mInputNumber+ " is a prime number");
                	break;
                	}
	  	}
	}
}

