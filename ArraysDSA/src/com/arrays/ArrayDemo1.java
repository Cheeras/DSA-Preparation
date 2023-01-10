package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String args[]) {
		

		/*Notes about the array
		 * 1. int arr[]; this is called array declaration here int is datatype and arr reference variable
		 * 2. array declaration happens at compile time
		 * 3. new int[5]; this is called creating the object in heap memory. this will happen and run time
		 * 4. array objects are created in heap
		 * 5. heap objects are not continous,(depends on JVM) hence array objects are not continuose because array objects are created in heap
		 * 6. Dynamic memory allocation meaning array creation happen at run time not compile time
		 * 7. Arrays are mutable in natare i.e we can change the elements of the array 
		 * */
		
		
		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];// array of primitives
		// with out initializing the array print array index of 1
		System.out.println(arr[1]);
		arr[0]=12;
		arr[1]=22;
		arr[2]=344;
		arr[3]=122;
		arr[4]=1;
		System.out.println(arr[1]);
		//we can initialize the array elements in for loop if you have more than 1000 records
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		
		// 1st way to print the array
		/*
		 * for(int i=0;i<arr.length;i++) { System.out.println(arr[i]); }
		 */
		// 2nd way to print array using for each loop
		/*
		 * for(int num : arr) { //for every element in the array print the array
		 * System.out.println(num+" ");//here num represent the element of the array }
		 */
		
		// 3rd way to print the array
		System.out.println(Arrays.toString(arr));
		
		
	}
}
