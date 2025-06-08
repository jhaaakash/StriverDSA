package com.aakash.advance.arrays.faq_medium;

public class KadaneAlgorithmBrute {
    public int maxSubArray(int[] nums) {
    int max=0;
    for(int i=0; i<nums.length; i++)
    {
        for(int j=i; j<nums.length; j++)
        {
           int sum=0;
           for(int k=i; k<=j; k++)
           {
               sum= sum+nums[k];
           }
           max= Math.max(max,sum);
        }
    }
    return max;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Create an instance of Solution class
        KadaneAlgorithmBrute sol = new KadaneAlgorithmBrute();

        int maxSum = sol.maxSubArray(arr);

        // Print the max subarray sum
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
