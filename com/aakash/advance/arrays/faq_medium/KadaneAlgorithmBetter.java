package com.aakash.advance.arrays.faq_medium;

public class KadaneAlgorithmBetter {
    public int maxSubArray(int[] nums) {
        int max= Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
        {    int sum=0;
            for(int j=i; j<nums.length; j++)
            {
                sum=sum+nums[j];
                max= Math.max(sum, max);
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Create an instance of Solution class
        KadaneAlgorithmBetter sol = new KadaneAlgorithmBetter();

        int maxSum = sol.maxSubArray(arr);

        // Print the max subarray sum
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
