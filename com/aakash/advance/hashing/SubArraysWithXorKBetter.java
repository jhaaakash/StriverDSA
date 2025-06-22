package com.aakash.advance.hashing;

public class SubArraysWithXorKBetter {

    public int subarraysWithXorK(int[] nums, int k) {
        int cnt=0;
        for(int i=0; i< nums.length; i++)
        {
            int xorr=0;
            for(int j=i; j<nums.length;j++)
            {
                xorr = xorr ^ nums[j];
                if(xorr==k)
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
        SubArraysWithXorKBetter solution = new SubArraysWithXorKBetter();
        // Function call to get the result
        int ans = solution.subarraysWithXorK(a, k);
        System.out.println();
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}
