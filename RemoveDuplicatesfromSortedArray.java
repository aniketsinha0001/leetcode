package com.leetcode;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int nums[] = { 6,5,5};
		int k = new RemoveDuplicatesfromSortedArray().removeDuplicates(nums);
		System.out.println("No of duplicate element removed-" + k);

	}

	 public int removeDuplicates(int[] nums) {
    	     int k = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] == nums[i]) {
				continue;
			}
			nums[k++] = nums[i - 1];
		}
		nums[k++] = nums[nums.length - 1];
	   return k;
        }

	public int removeDuplicatesHashSet(int[] nums) {
		Set<Integer> hs = new LinkedHashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			hs.add(nums[i]);
		}
		int j = 0;
		for (Integer k : hs) {
			nums[j++] = k;
		}
		return hs.size();
	}

    public int removeDuplicatesOld(int[] nums) {
        int k=0;
		int[] temp = new int[nums.length];
		for(int i =1;i<nums.length;i++) {
			if(nums[i-1]==nums[i]) {
				continue;
			}
			temp[k++] = nums[i-1];
		}
        temp[k++] = nums [nums.length-1];
        for(int j=0;j<temp.length;j++) {
			nums[j] = temp[j];
		}
        return k;
    }
	
}
