package com.sinha.aniket.array;

public class RemoveElement {

	public static void main(String[] args) {
		int nums[] = {3,2,2,3};
		int val = 3;
		int result = new RemoveElement().removeElement(nums,val);
		System.out.println(result);
	}
	public int removeElement(int[] nums, int val) {
	int j=0;
        	for(int i=0;i<nums.length;i++){
            		if(nums[i] != val){
                		nums[j++]=nums[i];
            		}
        	}
	return j;
    }

	public int removeElementOld(int[] nums, int val) {
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				continue;
			}
			nums[k++] = nums[i];
		}
		return k;
	}
}
