package com.aakash.advance.binarySearch.logical;

public class FirstAndLastOccuranceBrute {

    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        int n=nums.length-1;
        for(int i=0; i<=n;i++)
        {
            if(nums[i]==target)
            {
                first=i;
                break;
            }
        }
        for(int i=n; i>=0;i--)
        {
            if(nums[i]==target)
            {
                last=i;
                break;
            }
        }
        return new int[]{first,last};
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        // Create an instance of the Solution class
        FirstAndLastOccuranceBrute sol = new FirstAndLastOccuranceBrute();

        // Function call to find the first and last occurrences
        int[] result = sol.searchRange(nums, target);

        System.out.println("The first and last occurrences are at indices: "
                + result[0] + " and " + result[1]);
    }
}
