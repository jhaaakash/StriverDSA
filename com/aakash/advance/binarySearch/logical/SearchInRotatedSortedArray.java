package com.aakash.advance.binarySearch.logical;

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int k) {
        int index=-1;
        for(int i=0; i<nums.length;i++)
        {
            if(nums[i]==k)
            {
                index=i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        // Create an instance of the Solution class
        SearchInRotatedSortedArray sol = new SearchInRotatedSortedArray();

        // Function call to search for the target element
        int result = sol.search(nums, target);

        if (result == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + result);
    }
}
