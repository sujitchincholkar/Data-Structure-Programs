/***********************************************
 * Purpose :This program ​ use​ ​ a ​ ​deque​ ​ to​ ​store​  the​ ​characters​  of the​ ​ string​
 * 			and ​process​ ​the​ ​ string​ ​ from​ ​ left​ ​ to​ ​ right​ ​and​ ​add​ ​each​ ​character​​ to
 *			the​ ​ rear​ ​ of​ ​ the​ ​ deque.​
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

public class PalindromeChecker {
	Deque<Character> dQ;
	public static void main(String[] args) {
		PalindromeChecker pCheck=new PalindromeChecker();
		pCheck.dQ=new Deque<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String word=sc.next();
		char letters[]=word.toCharArray();
		for(int i=0;i<letters.length;i++){
			pCheck.dQ.addRear(letters[i]);
		}
		System.out.println(pCheck.checkPalindrome());

	}

	private boolean checkPalindrome() {
		boolean isPalindrome=false;
		while(!dQ.isEmpty()){
			if(dQ.size()!=1){
				if(dQ.removeFront().equals(dQ.removeRear())){
					isPalindrome=true;
				}else{
					isPalindrome=false;
					break;
				}
			}else{
				dQ.removeRear();
				isPalindrome=true;
			}
		}
		return isPalindrome;
		
	}

}
