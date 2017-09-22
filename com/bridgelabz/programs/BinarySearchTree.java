/***********************************************
 * Purpose :This program ​ use​ ​ a ​ ​ deque​ ​ to​ ​ store​ ​ the​ ​ characters​ ​ of
 *			the​ ​ string and process​ ​the​  string​ from​ ​left​ to​ ​right​ and​​ add​ ​each​ ​character​ ​to
 *				the​ ​ rear​ ​ of​ ​ the​ ​ deque.​
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter total number of nodes");
		int noOfNodes=scanner.nextInt();
		long noOfTree=Utility.possibleCombinations(noOfNodes);
		System.out.println(noOfTree);
	}

}
