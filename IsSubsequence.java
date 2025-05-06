package com.leetcode;

public class IsSubsequence {

	public static void main(String[] args) {
		String s = "abc", t = "ahbgdc";
		System.out.println(new IsSubsequence().isSubsequence(s, t));
	}

	public boolean isSubsequence(String s, String t) {
		int sLength = s.length();
		int tLength = t.length();
		int j = 0; 
		for (int i = 0; i < tLength && j < sLength; i++) {
			if (t.charAt(i) == s.charAt(j)) {
				j++;
			}
		}
		if (sLength == j) {
			return true;
		}
		return false;
	}

	public boolean isSubsequenceOld(String s, String t) {
		int m = s.length(), n = t.length();
		int i = 0, j = 0;
		for (; i < n && j < m;) {
			if (t.charAt(i) == s.charAt(j)) {
				j++;
			}
			i++;
		}
		return m == j;
	}
}
