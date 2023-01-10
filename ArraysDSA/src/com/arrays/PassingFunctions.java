package com.arrays;

import java.util.Arrays;

public class PassingFunctions {

	public static void main(String[] args) {

		int nums[] = {12,3,8,4};
		System.out.println(Arrays.toString(nums));
		change(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	static void change(int[] arr) {
		arr[1]=99;
	}

}
