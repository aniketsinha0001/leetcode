package com.leetcode;

public class MergeSortedArray {

	public static void main(String[] args) {
		int nums1[] = { 1, 2, 3, 4, 6, 8, 9 };
		int m = nums1.length;
		int nums2[] = { 2, 5, 6 };
		int n = nums2.length;
		new MergeSortedArray().merge(nums1, m, nums2, n);
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = 0, j = 0, k = 0;
		int mergeArray[] = new int[m + n];
		while (i < m && j < n) {
			if (nums1[i] < nums2[j]) {
				mergeArray[k++] = nums1[i++];
			} else {
				mergeArray[k++] = nums2[j++];
			}
		}
		while (i < m) {
			mergeArray[k++] = nums1[i++];
		}
		while (j < n) {
			mergeArray[k++] = nums2[j++];
		}
		for (int p = 0; p < mergeArray.length; p++) {
			nums1[p] = mergeArray[p];
		}
	}

}
