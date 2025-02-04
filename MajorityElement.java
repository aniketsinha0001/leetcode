package com.sinha.aniket.array;

public class MajorityElement {

	public static void main(String[] args) {
		int nums[] = { 2, 2, 1, 3, 1, 1, 4, 1, 1, 5, 1, 1, 6 };
		int result = new MajorityElement().majorityElement(nums);
		System.out.println(result);
	}

	public int majorityElement(int[] nums) {
		int element = nums[0];
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == element) {
				count++;
			} else {
				count--;
				if (count == 0) {
					element = nums[i];
					count = 1;
				}
			}
		}
		return element;
	}
}
