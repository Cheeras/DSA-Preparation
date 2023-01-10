package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimeArryList {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		for(int i=0;i<3;i++) {
			list.add(new ArrayList<>());
		}
		
		//input
		for(int i=0;i<3;i++) {
			list.get(i).add(input.nextInt());
		}
		//output
		
		for(int i=0;i<3;i++) {
			System.out.println();
		}
	}

}
