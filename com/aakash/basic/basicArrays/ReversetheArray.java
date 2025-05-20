package com.aakash.basic.basicArrays;

public class ReversetheArray {

    public int[] reverseArray(int[] nums) {
        reverse(nums, 0, nums.length-1);
        return nums;
    }

    public void reverse(int[] nums, int left, int right)
    {
        while(left<=right)
        {
            int temp= nums[left];
            nums[left]= nums[right];
            nums[right]=temp;
            left++;
            right--;
        }

    }

    public static void main(String[] args) {
        ReversetheArray solution = new ReversetheArray();
        int[] nums = {1, 2, 3, 4, 5};
        int[] result = solution.reverseArray(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
