package com.interview.preparation;

public class StringDemo {

	public static void main(String[] args) {
		
		
		String str = new String("Shankar");
		/*
		 * How many objects will create here
		 * String s = new String("shankar");
		 * s.concat("cheerala");
		 * Once we created a string object we cannot perform any changes
		 * in the existing object, if we are trying to perform any changes with those changes
		 * a new object will be created.This hehaviour is nothing but immutability of the String Objects
		 * StringBuffer sb = new StringBuffer("shankar");
		 * sb.append("cheerala");
		 * 
		 * */
		String str2 = "Shankar";
		System.out.println(str==str2);

	}

}
