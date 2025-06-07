package com.aakash.advance.arrays.faq_medium;

public class SortZeroOneTwo {

    public void sortZeroOneTwo(int[] nums) {

        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
            {
                count0++;
            }
            if(nums[i]==1)
            {
                count1++;
            }
            if(nums[i]==2)
            {
                count2++;
            }
        }

        int index = 0;
        for(int i=0; i<count0; i++)
        {
            nums[index++]=0;
        }
        for(int i=0; i<count1; i++)
        {
            nums[index++]=1;
        }
        for(int i=0; i<count2; i++)
        {
            nums[index++]=2;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 2, 0, 1};

        // Create an instance of Solution class
        SortZeroOneTwo sol = new SortZeroOneTwo();

        sol.sortZeroOneTwo(nums);

        // Print the array elements after sorting
        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
