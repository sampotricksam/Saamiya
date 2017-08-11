 /******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Distance.java
 *  Execution:    java -cp bin com.bridgelabz.util.Distance x y
 *  
 *  Purpose: Calculates Euclidean distance from the given point to the origin(0,0)
 *
 *  @author  Saamiya
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
/*PACKAGE NAMING STYLE*/
package com.bridgelabz.util;
public class Distance{
	public static void main(String[] args) {
		//parse x and y coordinates from command line arguments
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);

		//compute distance to(0,0)
		double distance=Math.sqrt(x*x+y*y);

		//output distance
		System.out.println("distance from the point " + x + " , " + y + " to the origin (0,0) = " +distance);
	}
}
/*OUTPUT
* C:\Users\samiya\Desktop\Saamiya>javac -d bin com/bridgelabz/util/Distance.java
*
* C:\Users\samiya\Desktop\Saamiya>java -cp bin com.bridgelabz.util.Distance 10 15
* distance from the point 10 , 15 to the origin (0,0) = 18.027756377319946
*/