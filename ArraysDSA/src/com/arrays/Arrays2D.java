package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {

	public static void main(String[] args) {

		/*
		 * 1 2 3 
		 * 4 5 6
		 * 7 8 9
		 * */
		Scanner input = new Scanner(System.in);
		int arr [][] = new int[3][3];// row size is mandatory but column size is optional
		System.out.println(arr.length);
		
	/*	int arr[][] = {
				{1,2,3}, // 0th index arr[0] = {1,2,3}
				{4,5}, //1st index arr[1] = {4,5}
				{6,7,8,9} //2nd index arr[2] = {6,7,8,9}
		 };*/
		// individual size of the array can vary as well
		//input 
		for(int row=0;row<arr.length;row++) {
		for(int col=0;col<arr[row].length;col++) {
			arr[row][col]=input.nextInt();
		}
		}
		
		//output
		
		/*for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}*/
		
		// output using Arrays.toString()
		for(int row=0;row<arr.length;row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
		
		// output using enhanced for loop
		for(int [] a : arr) { // every single element of arr it self is an array
			// every element in the array a is of type one dimentional integer array
			System.out.println(Arrays.toString(a));
		}
		
		
		
		
	}

}
