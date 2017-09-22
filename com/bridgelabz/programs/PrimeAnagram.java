/***********************************************
 * Purpose :This program prints prime number which are anagram
 * 			in range of 1 to 1000.​
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class PrimeAnagram {

	public static void main(String[] args) {
		String primeAnagram[][]={};
		primeAnagram=Utility.primeAnagramInRange();
		for(int i=0;i<primeAnagram.length;i++){
			if(primeAnagram[i][0]!=null){
			for(int j=0;j<primeAnagram[i].length;j++){
				if(primeAnagram[i][j]!=null){
					System.out.print(primeAnagram[i][j]+" ");
				}
			}
			System.out.println();
			}
		}
	}

}
