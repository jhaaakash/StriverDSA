package com.aakash.advance.sorting.algorithm;

public class InsertionSort {


    public int[] insertionSort(int[] nums) {

        int n=nums.length;

        for(int i=1;i<n;i++)
        {
            int j=i-1;
            int key=nums[i];
            while(j>=0 && nums[j]>key)
            {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }
        return nums;
    }
    public static void main(String[] args) {
        // Create an instance of solution class
        InsertionSort solution = new InsertionSort();

        int[] nums = {13, 12, 24, 52, 20, 9};

        System.out.println("Before Using Insertion Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Function call for insertion sort
        nums = solution.insertionSort(nums);

        System.out.println("After Using Insertion Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
