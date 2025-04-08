package com.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String strs[] = {"flower","flow","flight"};
		new LongestCommonPrefix().longestCommonPrefix(strs);
		
	}
    public String longestCommonPrefix(String[] strs) {
		Arrays.sort(strs);
		String start = strs[0];
		String end = strs[strs.length - 1];
		String common = "";
		for (int i = 0; i < start.length(); i++) {
			char endChar = end.charAt(i);
			if (start.charAt(i) == endChar) {
				common = common + end.charAt(i);
			} else {
				break;
			}
		}
		return common;
    }
	
    public String longestCommonPrefixOld(String[] strs) {
	    	Arrays.sort(strs);
			String first = strs[0];
			String last = strs[strs.length - 1];
			String common = checkFirstLast(first, last);
			System.out.println(common);
			return common;
     }

		private String checkFirstLast(String first, String last) {
			int n = first.length();
			int m = last.length();
			int small = 0;
			String common = "";
			if (m > n) {
				small = n;
			} else {
				small = m;
			}
			for (int i = 0; i < small; i++) {
				if (first.charAt(i) == last.charAt(i)) {
					common = common + first.charAt(i);
				} else {
					break;
				}
			}
			return common;
	    }
}
