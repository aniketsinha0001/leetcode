package com.leetcode;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		boolean flag = new ValidPalindrome().isPalindrome(s);
		System.out.println(flag);
	}

	public boolean isPalindromeOld(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		if (s.equalsIgnoreCase(new StringBuffer(s).reverse().toString())) {
			return true;
		}
		return false;
	}

	public boolean isPalindrome(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i++) != s.charAt(j--)) {
				return false;
			}
		}
		return true;
	}
}
