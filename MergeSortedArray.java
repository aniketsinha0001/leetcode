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
		int k = 0;
		int t = 0;
		int temp[] = new int[m + n];
		for (int i = 0, j = 0; i < m && j < n;) {
			t = j;
			if (nums1[i] < nums2[j] && i < m) {
				temp[k++] = nums1[i++];
			} else if (nums1[i] == nums2[j] && j < n) {
				temp[k++] = nums1[i++];
				temp[k++] = nums2[j++];
			} else {
				temp[k++] = nums2[j++];
			}
		}
		for (int i = t; i < n; i++) {
			temp[k++] = nums2[i];
		}
		nums1 = temp.clone();
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i]+" ");
		}
	}
}
