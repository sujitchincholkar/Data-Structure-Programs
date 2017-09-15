package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class QueueCalender {
	public static void main(String args[]){
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter month and year");
	int month=scanner.nextInt();
	int year=scanner.nextInt();
	String calender[][]=new String[7][7];
	Utility.fillArray(calender, month, year);
	}
}
