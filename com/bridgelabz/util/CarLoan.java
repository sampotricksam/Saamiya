 /******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/CarLoan.java
 *  Execution:    java -cp bin com.bridgelabz.util.CarLoan p n r 
 *  
 *  Purpose: Calculates monthly payments to be pay off
 *
 *  @author  Saamiya
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

class CarLoan{

	public static void main(String[] args){

    //Accepting values from user 
    double principle = Integer.parseInt(args[0]); 
    double year = Integer.parseInt(args[1]); 
    double rateOfInterest = Integer.parseInt(args[2]); 

		//Calculates the numbere of months
    double mNumber = 12 * year;

    //Calculates the rate of interest
    double rRate = rateOfInterest/(12 * 100);

    //calculating the denominator
		double k = 1 + rRate;
		double p = Math.pow(k,-mNumber);

		//Simplifying the solution into two variables i.e Numerator and Denomintor
    double denominator = 1 - p;
    double numerator = principle * rRate;

    //Calculating the loan
    double loanPerMonth = numerator/denominator;
		System.out.println("Rs "+loanPerMonth+" to be paid every month");
	}
}		

