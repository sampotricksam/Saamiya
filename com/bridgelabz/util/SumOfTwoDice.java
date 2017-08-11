package com.bridgelabz.util;
import java.lang.Integer;
import java.lang.Double;

	public class SumOfTwoDice{
		public static void main(String args []){
			/*parse is a method which take a string(input) as an argument and convert in double
			* dice1 variable stores the number entered by the user as the input
			* dice2 variable stores the number entered by the user as the input
			*/
			int dice1 = Integer.parseInt(args [0]);
			int dice2 = Integer.parseInt(args [1]); 

			System.out.println("The number of values required from dice1 is : " +dice1);
			System.out.println("The number of values required from dice2 is : " +dice2);

			for(int i=0;i<dice1;i++){
				for(int j=0;j<dice2;j++){

					//perform Math.random and stores in result1 and result2 variable
					double result1 = Math.random()*6+1;
					double result2 = Math.random()*6+1;

					//Display the ouput result1 and result2
					System.out.println("Value for dice1 is : " +result1);
					System.out.println("Value for dice2 is : " +result2);

					//performs the sum of both results and stores in sum variable
					double Sum = result1 + result2;

					System.out.println("The sum of two dice is : " +Sum);

				}
			}
		}
	}