package com.leetcode;

public class IsSubsequence {

	public static void main(String[] args) {
		String s = "abc", t = "ahbgdc";
		System.out.println(new IsSubsequence().isSubsequence(s, t));
	}

	public boolean isSubsequence(String s, String t) {
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
