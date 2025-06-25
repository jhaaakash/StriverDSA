package com.aakash.advance.binarySearch.fundamentals;

public class LowerBoundOptimal {
    public int lowerBound(int[] nums, int x) {
        int low=0;
        int high= nums.length-1;
        int ans= nums.length;
        while (low<high)
        {
           int mid=(low + high)/2;
           if(nums[mid] >= x)
           {
               ans=mid;
               high=mid-1;
           }
           else {
               low=mid+1;
           }

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int x = 2;

        // Create an instance of the Solution class
        LowerBoundOptimal sol = new LowerBoundOptimal();

        // Function call to find the lower bound
        int ind = sol.lowerBound(arr, x);

        System.out.println("The lower bound is the index: " + ind);
    }
}
