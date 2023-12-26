package com.interview.preparation;

public class CountOfSpecialCharacters {
	
	public static void main(String args[]) {
		
		String str = "^%$^%$^Welcome9088987To%$#%#$Selenium0890AutoMATION";
		int countOfSmall=0,countOfCap=0,countOfSpe=0,countOfDig=0;
		System.out.println(str.length());
		//iterate over string and compare each string
		for(int i = 0;i<=str.length()-1;i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				countOfSmall++;
			}else if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				countOfCap++;
			}else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				countOfDig++;
			}else {
				countOfSpe++;
			}
		}
		
		System.out.println("Count of Small letters "+countOfSmall);
		System.out.println("Count of Capital letters "+countOfCap);
		System.out.println("Count of Digits letters "+countOfDig);
		System.out.println("Count of Special letters "+countOfSpe);
		
		
	}
}
