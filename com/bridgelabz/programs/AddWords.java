/***********************************************
 * Purpose :This program ​ Read​ ​from​ ​file​ ​the​ ​list​ of​​ Words​ and​ ​take​ user​ ​input​ ​ 
 * 			to​ ​search​  a ​ Text​
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class AddWords {

	public static void main(String[] args) {
		String filePath="/home/bridgeit/Documents/myfile";
		String words[]=Utility.readFile(filePath);
		UnorderedList<String> linklist=new UnorderedList<>();
		for(int i=0;i<words.length;i++){
			linklist.add(words[i]);
		}
		linklist.printList();
		System.out.println("Enter word to search");
		Scanner scanner=new Scanner(System.in);
		String search=scanner.next();
		
		
		if(linklist.search(search)){
			System.out.println("Word is already present in linked list");
		}else {
			Utility.appendFile(search,filePath);
			System.out.println("Word Added to list");
		}
		
		
	}

}
