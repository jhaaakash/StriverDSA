package com.aakash.advance.arrays.fundamentals;

public class MaximumConsecutiveOne {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxi=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==1)
            {
                count++;
                maxi=Math.max(count, maxi);
            }
            else
            {
                count=0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        // Create an instance of the Solution class
        MaximumConsecutiveOne sol = new MaximumConsecutiveOne();
        // Find and print the maximum consecutive 1s
        int ans = sol.findMaxConsecutiveOnes(nums);
        System.out.println("The maximum consecutive 1's are " + ans);
    }
}
