package com.leetcode;

public class LengthofLastWord {

	public static void main(String[] args) {
		String s = "Hello World ";
		LengthofLastWord l = new LengthofLastWord();
		int length = l.lengthOfLastWord(s);
		System.out.println("length :" + length);
	}

	public int lengthOfLastWord(String s) {
		String lastWord[] = s.trim().split(" ");
		return (lastWord[lastWord.length - 1]).length();
	}

	public int lengthOfLastWordOptimize(String s) {
		int count = 0;
		boolean flag = true;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				if (flag) {
					continue;
				} else {
					break;
				}
			} else {
				if (s.charAt(i) != ' ') {
					count++;
					flag = false;
				}
			}
		}
		return count;
	}
}
