package com.leetcode.solution;

public class PalindromeNumber {

	public static void main(String[] args) {
		int x = 121;
		boolean result = new PalindromeNumber().isPalindrome(x);
		System.out.println(result);
	}

	public boolean isPalindrome(int x) {
		int num = x;
		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (rev == x) {
			return true;
		}
		return false;
	}
}
