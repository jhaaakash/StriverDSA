package com.aakash.advance.binarySearch.fundamentals;

public class UpperBoundBruteOptimal {

    public int upperBound(int[] nums, int x) {
        int low=0;
        int high=nums.length-1;
        int ans=nums.length;

        while(low <= high)
        {
            int mid=(low+high)/2;
            if(nums[mid] > x)
            {
                ans=mid;
                high=mid - 1;
            }
            else{
                low= mid +1;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 8, 9, 15, 19};
        int x = 9;
        // Create an instance of the Solution class
        UpperBoundBruteOptimal solution = new UpperBoundBruteOptimal();
        // Find the upper bound index for x
        int ind = solution.upperBound(nums, x);
        System.out.println("The upper bound is the index: " + ind);
    }
}
