/***********************************************
 * Purpose :This program program stores and print prime numbers in @D array.​
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Prime2D {

	public static void main(String[] args) {
		int primeArray[][] = new int[10][100];
		Utility.findPrimeInRange(primeArray);
		for(int i=0;i<primeArray.length;i++){
			for(int j=0;j<primeArray[i].length;j++){
				if(primeArray[i][j]!=0)
				System.out.print(primeArray[i][j]+" ");
			}
			System.out.println();
		}
	}

}
