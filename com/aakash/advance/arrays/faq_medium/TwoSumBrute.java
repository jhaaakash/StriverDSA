package com.aakash.advance.arrays.faq_medium;

public class TwoSumBrute {

    public int[] twoSum(int[] nums, int target) {

        for(int i=0; i< nums.length;i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }

    public static void main(String[] args) {
        int n = 5;
        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;

        // Create an instance of the Solution class
        TwoSumBrute sol = new TwoSumBrute();

        // Call the twoSum method to find the indices
        int[] ans = sol.twoSum(nums, target);

        // Print the result
        System.out.println("This is the answer: [" + ans[0] + ", " + ans[1] + "]");
    }
}
