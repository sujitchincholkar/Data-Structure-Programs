/***********************************************
 * Purpose :This program prints calendar for given month and year.​
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Calendar {

	public static void main(String[] args) {
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		String days[][]=new String[7][7];
		Utility.fillArray(days,month,year);
		Utility.printCalender(days,month,year);
	}
	
}
