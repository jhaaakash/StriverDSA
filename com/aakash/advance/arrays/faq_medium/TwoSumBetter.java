package com.aakash.advance.arrays.faq_medium;

import java.util.HashMap;
import java.util.Map;

public class TwoSumBetter {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int n= nums.length;
        for(int i=0; i<n; i++)
        {
            int num = nums[i];
            int moreNumber= target-num;
            if(map.containsKey(moreNumber))
            {
                return new int[]{map.get(moreNumber),i};
            }
            else {
                map.put(num, i);
            }
        }

        return new int[]{-1,-1};

    }

    public static void main(String[] args) {
        int n = 5;
        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;

        // Create an instance of the Solution class
        TwoSumBetter sol = new TwoSumBetter();

        // Call the twoSum method to find the indices
        int[] ans = sol.twoSum(nums, target);

        // Print the result
        System.out.println("This is the answer: [" + ans[0] + ", " + ans[1] + "]");
    }
}
