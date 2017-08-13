/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.util.FlipCoin 
 *  
 *  Purpose: Simulate a fair coin flip and print out "heads" or "tails".
 *
 *  @author  Saamiya
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;
 public class FlipCoin{
	static int head,tail,num,ctr,hctr,tctr,total;
 	public static void main(String[] args) {
		hctr=0;
		tctr=0;
		num=Integer.parseInt(args[0]);
		//num1=Integer.parseInt(args[1]);
 		/*Math.random() returns a value between 0.0 to 1.0
 		* so it is heads or tails 50% of the time
 		*/
 		for(ctr=1;ctr<num;ctr++){	
			if(Math.random()<0.5){
 			System.out.println("Heads");
			hctr++;
			
 			}	
 			else{
 			System.out.println("Tails");
			tctr++;
 			}
			total++;
		}
		head=(hctr*100)/total;
		tail=(tctr*100)/total;
		System.out.println("percentage of heads is " + head + " percentage of tail is " + tail );
 	}
 }


