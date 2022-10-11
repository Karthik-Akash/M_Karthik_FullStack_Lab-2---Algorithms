package com.gl.main;

import java.util.Scanner;

import com.gl.transaction.Transaction;

public class Main {
	
	public static void main(String[] args) {
	Transaction transaction = new Transaction();
	Scanner scanner = new Scanner(System.in);
	int noOfDenomi;
	System.out.println("Enter the size of currency denominations");
	noOfDenomi = scanner.nextInt();
	System.out.println("Enter the currency denomination value");
	int valueOfDenomi;
	int[] array = new int[noOfDenomi];
	for(int i = 0;i < noOfDenomi; i++) {
		array[i] = scanner.nextInt();
		
	}
	System.out.println("Enter the amount you want to pay");
	int amount = scanner.nextInt();
	transaction.bubbleSort(array);
	transaction.noOfNotes(array,amount);
	
}

}
