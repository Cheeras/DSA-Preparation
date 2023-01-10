package com.arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		//Q:Store a roll number
		int rollno = 19;
		//Q:Store a name of the student
		String name ="Kiran";
		//Q:Store 5 students roll numbers
		int rollno1 = 10;
		int rollno2 = 11;
		int rollno3 = 12;
		int rollno4 = 13;
		int rollno5 = 14;

		//above method will be good approach to store 
		//we can go array
		//Syntax
		//datatype [] variable_Name = new datatype[size];
		//or
		//int rollnums = {10,12,23,43,55};
		
		int [] rnos = new int[5];
		
		int [] rnos1; // declaration of arrays, rnos1 is defined in side stack
		
		rnos1 = new int[5]; // actual memory creation, creation in heap memory
		
	}

}
