package com.aakash.advance.sorting.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public void merge(int[] nums, int low,int mid, int high)
    {
        List<Integer> temp = new ArrayList<>();
        int left= low;
        int right=mid+1;

        while (left <=mid && right <=high)
        {
            if(nums[left] <= nums[right])
            {
                temp.add(nums[left]);
                left++;
            }
            else {
                temp.add(nums[right]);
                right++;
            }
        }

        while ( left<=mid)
        {
            temp.add(nums[left]);
            left++;
        }

        while (right <=high)
        {
            temp.add(nums[right]);
            right++;
        }

        for( int i = low;i<=high;i++)
        {
            nums[i]=temp.get(i-low);
        }

    }

    public  void mergeSortHelper(int[] nums, int low, int high)
    {
        if(low >=high)
        {
            return;
        }
        int mid=(low+high)/2;

        mergeSortHelper(nums,low,mid);
        mergeSortHelper(nums,mid+1, high);
        merge(nums, low,mid, high);

    }

    public int[] mergeSort(int[] nums) {
        int n = nums.length; // Size of array

        mergeSortHelper(nums, 0,n-1);
        return nums;
    }


    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        int n = arr.length;

        System.out.println("Before Sorting Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        // Create an instance of the Solution class
        MergeSort sol = new MergeSort();
        // Function call to sort the array
        int[] sortedArr = sol.mergeSort(arr);

        System.out.println("After Sorting Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(sortedArr[i] + " ");
        System.out.println();
    }
}
