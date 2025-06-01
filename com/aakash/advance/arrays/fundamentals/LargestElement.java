package com.aakash.advance.arrays.fundamentals;

public class LargestElement {

    public int largestElement(int[] nums) {
        int max=nums[0];
        for( int i=0;i<nums.length; i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,2};

        //Make an intance of the Solution class
        LargestElement sol = new LargestElement();

        int largest = sol.largestElement(nums);

        // Print the largest element.
        System.out.print(largest);
    }
}

