package com.interview.preparation;

public class WordReverseInString {

	public static void main(String[] args) {
		
		String str = "LTIMindtree Blue Book";
		String[] words = str.split(" ");//split sentence using space
		String revSent="";
		//iterate each word using for each loop
		for(String word : words) {
			String revWord="";
			for(int i=word.length()-1;i>=0;i--) {
				revWord = revWord+word.charAt(i);
			}
			revSent = revSent + revWord +" ";
		}
		System.out.println(revSent);
	}
}
