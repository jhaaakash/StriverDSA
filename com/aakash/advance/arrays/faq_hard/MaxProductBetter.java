package com.aakash.advance.arrays.faq_hard;

public class MaxProductBetter {

    public int maxProduct(int[] nums) {
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int p = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                result = Math.max(result, p);
                p *= nums[j];
            }
            result = Math.max(result, p);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {4, 5, 3, 7, 1, 2};

        // Create an instance of the Solution class
        MaxProductBetter sol = new MaxProductBetter();

        int maxProd = sol.maxProduct(nums);

        // Print the result
        System.out.println("The maximum product subarray: " + maxProd);
    }
}
