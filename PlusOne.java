package com.leetcode.solution;

public class PlusOne {

	public static void main(String[] args) {
		int digits[] = { 5, 6, 2, 0, 0, 4, 6, 2, 4, 9 };
		int result[] = new PlusOne().plusOne(digits);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);

		}
	}

	public int[] plusOne(int[] digits) {
		int rem = digits[digits.length - 1] % 10;
		boolean flag = true;
		if (rem == 9) {
			String s = "";
			for (int i = 0; i < digits.length; i++) {
				int reminder = digits[i] % 10;
				if (reminder != 9) {
					flag = false;
				}
				s = s + digits[i];
			}
			long num = Long.parseLong(s) + 1;
			if (flag) {
				int temp[] = new int[digits.length + 1];
				for (int i = temp.length - 1; i >= 0; i--) {
					temp[i] = (int) (num % 10);
					num = num / 10;
				}
				return temp;
			}
			for (int i = digits.length - 1; i >= 0; i--) {
				digits[i] = (int) (num % 10);
				num = num / 10;
			}

		} else {
			digits[digits.length - 1] = digits[digits.length - 1] + 1;
			return digits;
		}
		return digits;
	}
}
