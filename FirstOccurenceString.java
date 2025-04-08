package com.leetcode;

public class FirstOccurenceString {

	public static void main(String[] args) {
		String haystack = "sadbutsad", needle = "sad";
		new FirstOccurenceString().strStr(haystack, needle);
	}

	public int strStr(String haystack, String needle) {
		if (needle.isEmpty()) {
			return 0;
		}
		return haystack.indexOf(needle);
	}

}
