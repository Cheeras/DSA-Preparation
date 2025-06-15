package com.interview.preparation;

import java.util.HashMap;

public class StrringCompression {

	public static void main(String[] args) {
		
		String str = "AABBCCAaaaADDDEE";
		//output
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<str.length()-1;i++) {
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			}
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		for(char ch2: map.keySet()) {
				System.out.println(ch2+"="+map.get(ch2));
		}
		
	}
}
