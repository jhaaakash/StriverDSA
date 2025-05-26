package com.aakash.basic.basicRecursion;

public class SumOfArrayElement {

    public int arraySum(int[] nums) {
        return sum(nums, 0);
    }
    private  int sum(int nums[], int left)
    {
        if(left >=nums.length)
        {
            return  0;
        }
        return  nums[left] + sum(nums, left+1);
    }

    public static void main(String[] args) {
        SumOfArrayElement solution = new SumOfArrayElement();
        int[] nums = {1, 2, 3};
        int result = solution.arraySum(nums);
        System.out.println(result);
    }
}
