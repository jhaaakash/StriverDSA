package com.aakash.advance.arrays.faq_hard;

public class MaxProductBrute {

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod = prod * nums[k];
                }
                max = Math.max(max, prod);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {4, 5, 3, 7, 1, 2};

        // Create an instance of the Solution class
        MaxProductBrute sol = new MaxProductBrute();

        int maxProd = sol.maxProduct(nums);

        // Print the result
        System.out.println("The maximum product subarray: " + maxProd);
    }
}
