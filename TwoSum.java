package com.leetcode;

public class TwoSum {

	public static void main(String[] args) {
		int nums[] = { 2,7,11,15 };
		int k = 9;
		int[] sum = twoSum(nums, k);
		for(int i=0;i<sum.length;i++)
		System.out.println(sum[i]);
	}
	
	public static int[] twoSum(int[] nums, int target) {
	Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (hm.containsKey(diff)) {
				return new int[] { hm.get(diff), i };
			}
			hm.put(nums[i], i);
		}
	return new int[] {};
	}

	public static int[] twoSumOld(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return result;
	}

}
