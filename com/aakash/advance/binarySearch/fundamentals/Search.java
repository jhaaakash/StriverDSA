package com.aakash.advance.binarySearch.fundamentals;

public class Search {
    public int search(int[] nums, int target) {
        int low=0;
        int high= nums.length-1;
        while(low<=high)
        {
            int mid= (low + high) /2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(target > nums[mid])
            {
                low= mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {-1, 0, 3, 5, 9, 12};
        int target = 9;

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
