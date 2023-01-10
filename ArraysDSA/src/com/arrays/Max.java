package com.arrays;

public class Max {

	public static void main(String[] args) {

		int arr[] = {1,23,4,5,18,32};
		int max = maxValueInRange(arr,1,4);
		System.err.println(max);
	}
	
	// work on edge cases
	static int max(int[] arr) {
		if(arr.length==0) return -1;
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

	//work on edge cases
	static int maxValueInRange(int[] arr,int start,int end) {
		if(end>start) {
			return -1;
			}
		if(arr==null) {
			return -1;
		}
		int max=arr[start];
		for(int i=start;i<end;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
}
