package com.aakash.advance.arrays.faq_medium;

public class KadaneAlgorithmOptimal {
    public int maxSubArray(int[] nums) {
        //Kadan Algorithm

        //if sum is less than zero. drop the numer and reset the sum to zero
        int max= Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<nums.length; i++)
        {
            sum=sum+nums[i];
            // Update maxi if current sum is greater
            if (sum > max) {
                max = sum ;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return  max;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Create an instance of Solution class
        KadaneAlgorithmOptimal sol = new KadaneAlgorithmOptimal();

        int maxSum = sol.maxSubArray(arr);

        // Print the max subarray sum
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
