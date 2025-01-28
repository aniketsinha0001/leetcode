package com.leetcode;

public class MergeSortedArray {
	
public static void main(String[] args) {
		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int nums2[] = { 2, 5, 6 };
		int n = 3;
		new MergeSortedArray().merge(nums1, m, nums2, n);
	}
	
public void merge(int[] nums1, int m, int[] nums2, int n) {
		  int[] temp = new int[m + n];
		    int i = 0, j = 0, k = 0;
		    for (; i < m && j < n; k++) {
		        if (nums1[i] <= nums2[j]) {
		            temp[k] = nums1[i++];
		        } else {
		            temp[k] = nums2[j++];
		        }
		    }

		    for (; i < m; i++, k++) {
		        temp[k] = nums1[i];
		    }

		    for (; j < n; j++, k++) {
		        temp[k] = nums2[j];
		    }
		    for (i = 0; i < nums1.length; i++) {
		        nums1[i] = temp[i];
		        System.out.println(nums1[i]);
		    }
	}
}
