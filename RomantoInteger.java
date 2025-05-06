package com.leetcode;

import java.util.HashMap;
import java.util.Map;

//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
public class RomantoInteger {
	int sum = 0;

	public static void main(String[] args) {
		String s = "MCMXCIV";
		System.out.println(new RomantoInteger().romanToInt(s));
	}

	public int romanToInt(String s) {
		Map<Character, Integer> hm = new HashMap<>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			int value = hm.get(s.charAt(i));
			if (i < s.length() - 1 && value < hm.get(s.charAt(i + 1))) {
				sum -= value;
			} else {
				sum += value;
			}
		}
		return sum;
	}
}
