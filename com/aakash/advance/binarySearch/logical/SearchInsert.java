package com.aakash.advance.binarySearch.logical;

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length; i++)
        {
            if(nums[i] >= target)
            {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int target = 5;

        // Create an instance of the Solution class
        SearchInsert sol = new SearchInsert();

        // Find the insertion index
        int index = sol.searchInsert(nums, target);
        System.out.println("The index is: " + index);
    }
}
