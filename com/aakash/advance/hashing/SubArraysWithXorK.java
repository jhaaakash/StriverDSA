package com.aakash.advance.hashing;

public class SubArraysWithXorK {

    public int subarraysWithXorK(int[] nums, int k) {
        int cnt=0;
        for(int i=0; i< nums.length; i++)
        {
            for(int j=i; j<nums.length;j++)
            {
                int xorr=0;
                for(int K=i; K<=j;K++)
                {
                    xorr = xorr ^ nums[K];
                }
                if(xorr == k)
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        // Create an instance of the Solution class
        SubArraysWithXorK solution = new SubArraysWithXorK();
        // Function call to get the result
        int ans = solution.subarraysWithXorK(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}
