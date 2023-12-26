package com.interview.preparation;

public class RemoveSpeicalCharacters {

	public static void main(String[] args) {
		String str = "$%#%$#%$Welcome)(*)(*()to98798SELENIUM$%%$%$Automation";
		//by using the regular expression
		//[^a-zA-Z0-9]// meaning replace other than charaters and numbers from given string
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

	}
}
