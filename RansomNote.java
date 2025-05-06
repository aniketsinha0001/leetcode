package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public static void main(String[] args) {
		String ransomNote = "aab", magazine = "aba";
		boolean result = new RansomNote().canConstruct(ransomNote, magazine);
		System.out.println(result);
	}

	public boolean canConstruct(String ransomNote, String magazine) {
		Map<Character, Integer> magazineMap = new HashMap<>();
		for (Character ch : magazine.toCharArray()) {
			if (magazineMap.containsKey(ch)) {
				magazineMap.put(ch, magazineMap.get(ch) + 1);
			} else {
				magazineMap.put(ch, 1);
			}
		}
		for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false;
            }
            magazineMap.put(c, magazineMap.get(c) - 1);
        }
		return true;
	}
}
