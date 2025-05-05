package com.leetcode.solution;


public class PlusOne {

	public static void main(String[] args) {
		int digits[] = { 5, 2, 2, 6, 5, 7, 1, 9, 0, 3, 8, 6, 8, 6, 5, 2, 1, 8, 7, 9, 8, 3, 8, 4, 7, 2, 5, 8, 9 };
		int result[] = new PlusOne().plusOne(digits);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}

	public int[] plusOne(int[] digits) {
		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] array = new int[n + 1];
		array[0] = 1;
		return array;
	}
}
