package com.aakash.advance.binarySearch.fundamentals;

public class SearchRecursive {
    public int func(int[] nums, int low, int high, int target)
    {
        if(low>high)
        {
            return-1;
        }
        int ind;
        int mid= (low + high)/2;
        if(nums[mid]==target)
        {
            ind=mid;
        }
        else if( nums[mid]> target)
        {
            ind= func(nums, low,mid-1, target);
        }
        else{
            ind= func(nums,mid+1, high,target);
        }
        return ind;
    }
    public int search(int[] nums, int target) {
        int n= nums.length;

        return func(nums, 0, n-1, target );
    }


    public static void main(String[] args) {
        int[] a = {-1, 0, 3, 5, 9, 12};
        int target = 12;
        // Creating an instance of Solution class
        Search sol = new Search();
        // Function call to find the given target in a sorted array
        int ind = sol.search(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }

}
