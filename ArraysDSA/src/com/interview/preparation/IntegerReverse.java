package com.interview.preparation;

public class IntegerReverse {

	public static void main(String[] args) {
		
		int num = 78965;//56987
		int rem =0;
		int rev =0;
		while(num!=0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		System.out.println(rev);
		
		int num3 = 12345;
		System.out.println("Using String buffer ");
		String num2 = String.valueOf(num3);//convert integer to String 
		StringBuffer sb = new StringBuffer(num2);
		System.out.println(sb.reverse());
		
	}
}
