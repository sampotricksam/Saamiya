/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/WindChill.java
 *  Execution:    java -cp bin com.bridgelabz.util.WindChill t v 
 *  
 *  Purpose: Finds the WindChill in temperature
 *
 *  @author  Saamiya
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
/*PACKAGE NAMING STYLE*/

package com.bridgelabz.util;

import java.lang.Double;

public class WindChill{

	public static void main(String args[]){

        /*parse is a method which take a string(input) as an argument and convert in double
        * t and v variable stores the temperature and velocity entered by user as input
        */
        double t = Integer.parseInt(args[0]);
        double v =Integer.parseInt(args[1]);
        

        //prints temperature and velocity 
        System.out.println("You have entered Temperature as " + t + " Farehnith and velocity as " + v);
        
        /*variable WinChill stores the calculated WindChill
        * Math is used to calculate power
        */
        double WindChill = 35.74 + 0.625*t + (0.4275 * t - 35.75) * Math.pow(v,0.16);


        //prints the Chill
        System.out.println("The Chill is " + WindChill);
    }
}

/*OUTPUT
* C:\Users\samiya\Desktop\Saamiya>javac -d bin com/bridgelabz/util/WindChill.java
*
* C:\Users\samiya\Desktop\Saamiya>java -cp bin com.bridgelabz.util.WindChill 22 10
* You have entered Temperature as 22.0 Farehnith and velocity as 10.0
* The Chill is 11.409889239698543
*/