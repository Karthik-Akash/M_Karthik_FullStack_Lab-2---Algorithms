package com.gl.program.main;

import java.util.Scanner;

import com.gl.program.transaction.Transaction;

public class Main {

	public static void main(String[]args) {
		Transaction transaction = new Transaction();
		Scanner scanner = new Scanner(System.in);
		int sizeOfArray;
		System.out.println("Enter the size of transaction array");
		sizeOfArray = scanner.nextInt();
		System.out.println("Enter the value of array");
		int[] array = new int[sizeOfArray];
		for(int i= 0; i< sizeOfArray; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter the total number of targets that need to be achieve");
		int target = scanner.nextInt();
		for(int i=0; i < target; i++) {
			System.out.println("Enter the value of target");
			int value = scanner.nextInt();
			transaction.isTargetAchievable(value, array);
		}
	}
	
}
