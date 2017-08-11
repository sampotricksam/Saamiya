 /******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/DayOfWeek.java
 *  Execution:    java -cp bin com.bridgelabz.util.DayOfWeek d m y 
 *  
 *  Purpose: Finds the DayOfWeek for entered date
 *
 *  @author  Saamiya
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
/*PACKAGE NAMING STYLE*/
package com.bridgelabz.util;

class DayOfWeek{

	public static void main(String[] args) {

       //Accepting values from user
       int date = Integer.parseInt(args[0]); 
       int month = Integer.parseInt(args[1]); 
       int year = Integer.parseInt(args[2]); 

       System.out.println(" The date month and year is " + date + " / " + month + " / " +year);

		//Calculates the year
		int y = year - (14 - month)/12;

		//Checks for leap Year
		int x = y + (y/4) - (y/100) + (y/400);

		//Checks for month
		int m = month + 12 * ((14 - month) / 12) - 2;

		//Checks the value associated with Day i.e from 0 to 6 
		int day = (date + x + (31 * m)/12)%7;
		//System.out.println(" DayOfWeek is " + day);
		
		//Prints the day
        if (day == 1)
		System.out.println("The DayOfWeek is " + day + " and it is Monday");

	    else if (day == 2)
		System.out.println("The DayOfWeek is " + day + " and it is Tuesday");

	    else if (day == 3)
		System.out.println("The DayOfWeek is " + day + " and it is Wednesday");

	    else if (day == 4)
		System.out.println("The DayOfWeek is " + day + " and it is Thrusday");

	    else if (day == 5)
		System.out.println("The DayOfWeek is " + day + " and it is Friday");

	    else if (day == 6)
		System.out.println("The DayOfWeek is " + day + " and it is Saturday");

	    else
		System.out.println("The DayOfWeek is " + day + " and it is Sunday");
	}
}	

/*OUTPUT
* 
* C:\Users\samiya\Desktop\Saamiya>javac -d bin com/bridgelabz/util/DayOfWeek.java
*
* C:\Users\samiya\Desktop\Saamiya>java -cp bin com.bridgelabz.util.DayOfWeek 11 08 2017
* The date month and year is 11 / 8 / 2017
* The DayOfWeek is 5 and it is Friday
*/	