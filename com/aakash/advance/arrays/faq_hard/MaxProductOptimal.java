package com.aakash.advance.arrays.faq_hard;

public class MaxProductOptimal {

    public int maxProduct(int[] nums) {
       int n=nums.length;
       int ans=Integer.MIN_VALUE;
       int prefix=1, suffix=1;
       for(int i=0; i<n; i++)
       {
           if(prefix==0)
           {
               prefix=1;
           }
           if(suffix==0)
           {
               suffix=1;
           }
           prefix=prefix*nums[i];
           suffix=suffix*nums[n-i-1];

           ans= Math.max(ans, Math.max(prefix,suffix));
       }
       return ans;
    }
    public static void main(String[] args) {
        int[] nums = {4, 5, 3, 7, 1, 2};

        // Create an instance of the Solution class
        MaxProductOptimal sol = new MaxProductOptimal();

        int maxProd = sol.maxProduct(nums);

        // Print the result
        System.out.println("The maximum product subarray: " + maxProd);
    }
}
