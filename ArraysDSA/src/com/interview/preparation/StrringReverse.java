package com.interview.preparation;

public class StrringReverse {

	public static void main(String[] args) {
		String str = "Welcome to Selenium Automation";
		//using the for loop
		
		String rev = "";
		int len = str.length()-1;
		for(int i=len;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		System.out.println("By using string buffer ");
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
